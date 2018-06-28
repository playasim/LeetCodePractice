package BinaryTree;

import java.util.Arrays;

/*
将一个
 */
public class sortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {


        TreeNode root = generateBST(nums, 0, nums.length);
        return root;
    }

    private TreeNode generateBST(int[] nums, int start, int end) {

        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left = generateBST(nums, start, mid);

        root.right = generateBST(nums, mid + 1, end);

        return root;

    }
}
