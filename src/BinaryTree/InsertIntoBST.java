package BinaryTree;

public class InsertIntoBST {
    TreeNode res;
    public TreeNode insertIntoBST(TreeNode root, int val) {
        res = root;

        helper (root, val);

        return res;


    }

    private void helper(TreeNode root, int val) {

        if (root == null) {
            return;
        }
        if (root.left == null  && root.val > val) {
            root.left = new TreeNode(val);

        }

        if (root.right == null && root.val < val) {
            root.right = new TreeNode(val);
        }

        if (root.val > val) {
            helper(root.left, val);
        }

        if (root.val < val) {
            helper(root.right, val);
        }
    }
}
