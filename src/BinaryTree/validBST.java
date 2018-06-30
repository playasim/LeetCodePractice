package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class validBST {


    public boolean isValidBST(TreeNode root)  {
        return isBSTUtil(root, Integer.MIN_VALUE,
                Integer.MAX_VALUE);
    }

    /* Returns true if the given tree is a BST and its
      values are >= min and <= max. */
    boolean isBSTUtil(TreeNode node, int min, int max)
    {
        List<Integer> res = new ArrayList<>();
        /* an empty tree is BST */
        if (node == null)
            return true;

        /* false if this node violates the min/max constraints */
        if (node.val < min || node.val > max)
            return false;

        /* otherwise check the subtrees recursively
        tightening the min/max constraints */
        // Allow only distinct values
        return (isBSTUtil(node.left, min, node.val-1) &&
                isBSTUtil(node.right, node.val+1, max));
    }


}
