package BinaryTree;

public class minDepth {

    public int minDepth(TreeNode root) {


        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        } else {
            int leftDepth = 0, rightDepth = 0;
            if (root.left != null) {
                leftDepth = minDepth(root.left);
            }
            if (root.right != null) {
                rightDepth = minDepth(root.right);
            }

            if (leftDepth != 0 && rightDepth != 0) {
                return Math.min(leftDepth, rightDepth) + 1;
            } else {
                if (leftDepth == 0) {
                    return rightDepth + 1;
                } else {
                    return leftDepth + 1;
                }
            }

        }

    }

}
