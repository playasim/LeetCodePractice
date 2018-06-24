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


        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.right.right = new TreeNode(4);

        new mergeTrees().mergeTrees(root, root2);
    }
}
