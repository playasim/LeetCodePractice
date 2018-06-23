package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Traversal {

    List<Integer> preRes = new ArrayList<Integer>();

    List<Integer> inRes = new ArrayList<>();

    List<Integer> afterRes = new ArrayList<>();

    List<List<Integer>> levelRes = new ArrayList<>();

    public List<Integer> preOrder (TreeNode root) {

        if (root == null) {
            return preRes;
        }
        preRes.add(root.val);

        preOrder(root.left);
        preOrder(root.right);

        return preRes;
    }

    public List<Integer> inOrder (TreeNode root) {
        if (root == null) {
            return inRes;
        }

        inOrder(root.left);
        inRes.add(root.val);
        inOrder(root.right);

        return inRes;
    }

    public List<Integer> afterOrder(TreeNode root) {

        if (root == null) {
            return afterRes;
        }
        afterOrder(root.left);
        afterOrder(root.right);
        afterRes.add(root.val);

        return afterRes;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (root == null) {
            return new ArrayList<>();
        }
        TreeNode current = null;

        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> levelList = new ArrayList<>();
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i ++) {
                current = queue.poll();
                levelList.add(current.val);
                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            levelRes.add(levelList);

        }

        return levelRes;
    }
}
