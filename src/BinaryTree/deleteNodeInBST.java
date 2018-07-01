package BinaryTree;
/*
1. if target have no sub-node, remove directly.
2. 1 sub-node,using sub replace it.
3. 2 sub-nodes, replace it using leftmost node in right sub-trees.
 */
public class deleteNodeInBST {
    TreeNode res;
    public TreeNode deleteNode(TreeNode root, int key) {
        res = root;
        helper (root, key);
        return res;
    }

    private void helper (TreeNode root, int key) {
        if (root == null) {
            return;
        }

        if (root.val == key) {
            if (root.left == null && root.right == null) {
                root = null;
                return;
            }

            if (root.left != null && root.right != null) {
                TreeNode startNode = root;

                replaceNode(root.right, startNode, key);
            }

            if (root.left != null) {
                int temp = root.left.val;
                root.left = null;
                root.val = temp;
            }

            if (root.right != null) {
                int temp = root.right.val;
                root.right = null;
                root.val = temp;
            }
        }

        helper(root.left, key);

        helper(root.right, key);

    }


    private void replaceNode(TreeNode root, TreeNode startNode, int key) {
        if (root == null) {
            return;
        }

        int temp = root.val;
        root = null;
        startNode.val = temp;
        replaceNode(root.left, startNode, key);
    }
}
