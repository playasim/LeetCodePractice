package BinaryTree;

/*
maxDepth problem solution using recursive method
 */
public class maxDepth {


    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        return maximumDepth(root, 1);


    }

    int answer = 0;
    private int maximumDepth(TreeNode root, int depth) {

        if (root == null) {
            return 0;
        }
        answer = Math.max(answer, depth);
        maximumDepth(root.left, depth + 1);
        maximumDepth(root.right, depth + 1);
        return answer;

    }
}
