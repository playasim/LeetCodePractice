package BinaryTree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class buildTree {

    public TreeNode buildTreeUsingInAnndPostOrder(int[] inorder, int[] postorder) {
        //get root

        if (inorder == null || postorder == null) {
            return null;
        }

        Map<Integer, Integer> inIdx = new HashMap<Integer, Integer>();

        for (int i = 0; i < inorder.length; i ++) {
            inIdx.put(inorder[i], i);
        }

        return helper(0, inorder.length - 1,inorder, postorder, postorder.length - 1, inIdx);

    }

    private TreeNode helper (int instart, int inend, int[] inorder, int[] postorder, int postIdx, Map<Integer, Integer> inIdx) {


        if (postIdx < 0 || instart > inend) {
            return null;
        }

        TreeNode root = new TreeNode(postorder[postIdx]);

        int idx = inIdx.get(postorder[postIdx]);

        root.right = helper(idx + 1, inend, inorder, postorder, postIdx - 1, inIdx);
        root.left = helper(instart, idx - 1, inorder, postorder, postIdx - 1 - (inend - idx), inIdx);

        return root;
    }
}
