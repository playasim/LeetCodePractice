package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class levelOrderButtom {

    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        dfs(root, 0);
        for (int i = 0; i < result.size() / 2; i ++) {
            List<Integer> temp = result.get(i);
            result.set(i, result.get(result.size() - i - 1));
            result.set(result.size() - 1 - i, temp);
        }
        return result;



    }

    private void dfs(TreeNode root, int depth) {

        if (root == null) {
            return;
        }

        if (result.size() <= depth) {
            result.add(new ArrayList<>());
        }

        result.get(depth).add(root.val);

        dfs(root.left, depth + 1);

        dfs(root.right, depth + 1);
    }
}
