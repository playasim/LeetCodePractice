package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class zigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null) return res;
        q.add(root);
        int count = 0;
        while (!q.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                temp.add(node.val);
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);

            }
            if (count % 2 == 1) reverse(temp);
            res.add(temp);
            count ++;
        }
        return res;

    }

    private void reverse(List<Integer> list) {
        int size = list.size();
        int j;
        for (int i = 0; i < size/2; i++) {
            j = size - i - 1;
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);

        }
    }
}
