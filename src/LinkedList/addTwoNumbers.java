package LinkedList;
/*
给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。

你可以假设除了数字 0 之外，这两个数字都不会以零开头。

示例：

输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807
 */
public class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
        int val, forward = 0;
        while ( l1 != null && l2 != null) {
             val = l1.val + l2.val + forward;
             res.next = new ListNode(val % 10);
             forward = val >= 10 ? 1 : 0;
             l1 = l1.next;
             l2 = l2.next;
             res = res.next;
        }

        while (l1 != null) {
            val = (l1.val + forward);
            res.next = new ListNode(val % 10);
            forward = val >= 10 ? 1 : 0;
            l1 = l1.next;
            res = res.next;
        }

        while (l2 != null) {
            val = (l2.val + forward);
            res.next = new ListNode(val % 10);
            forward = val >= 10 ? 1 : 0;
            l2 = l2.next;
            res = res.next;
        }
        if (forward != 0)
            res.next = new ListNode(1);

        return dummy.next;
    }


}
