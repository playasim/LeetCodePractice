package LinkedList;

import java.util.Arrays;

public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        return sort(lists, 0, lists.length - 1);
    }

    private ListNode sort(ListNode[] lists, int lo, int hi) {
        if (lo >= hi) return lists[lo];
        int mid = (lo + hi) / 2;
        ListNode l1 = sort(lists, lo, mid);
        ListNode l2 = sort(lists, mid + 1, hi);
        return merge(l1, l2);
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                node.next = new ListNode(l2.val);
                l2 = l2.next;
            } else {
                node.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            node = node.next;
        }

        while (l1 != null) {
            node.next = new ListNode(l1.val);
            node = node.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            node.next = new ListNode(l2.val);
            node = node.next;
            l2 = l2.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        MergeKLists mk = new MergeKLists();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode[] list = new ListNode[]{l1, l2, l3};
        mk.mergeKLists(list);
    }
}
