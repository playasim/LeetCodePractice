package BinaryTree;

import java.util.List;

/*
mainly for testing
 */
public class TestMainClass {

    public static void main(String args[]) {

        Traversal traversal = new Traversal();

        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);

        List<Integer> preorderList = traversal.afterOrder(root);

    }
}
