package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class averageOfLevels {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> res = new ArrayList<>();

        queue.add(root);
         while (!queue.isEmpty()) {
             Queue<TreeNode> temp = new LinkedList<>();
             int sum = 0;
             int count = 0;
             while (!queue.isEmpty()) {
                 TreeNode node = queue.poll();

                 sum += node.val;
                 count ++;
                 if (node.left != null) {
                     temp.add(node.left);
                 }
                 if (node.right != null) {
                     temp.add(node.right);
                 }
             }
             queue = temp;
             res.add(sum * 1.0 / count);
         }

         return res;



    }
}
