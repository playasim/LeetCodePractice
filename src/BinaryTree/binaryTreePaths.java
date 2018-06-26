package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class binaryTreePaths {

    List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }

        findPath("", root);



        return result;




    }

    private void findPath (String curr, TreeNode root) {
        if (root == null) {
            return;
        }

        curr += root.val;

        if (root.left == null && root.right == null) {
            result.add(curr);

        }

        curr += "->";

        findPath(curr, root.left);

        findPath(curr, root.right);
    }
}
