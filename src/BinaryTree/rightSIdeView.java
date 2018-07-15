package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class rightSIdeView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) return res;
        queue.add(root);
        int current = 1;
        int next = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (current == 1) res.add(node.val);
            current --;
            if (node.left != null) {
                queue.add(node.left);
                next ++;
            }
            if (node.right != null) {
                queue.add(node.right);
                next ++;
            }
            if (current == 0) {
                current = next;
                next = 0;
            }

        }
        return res;
    }
}
