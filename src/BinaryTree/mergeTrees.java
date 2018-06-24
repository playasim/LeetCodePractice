package BinaryTree;

public class mergeTrees {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
           // System.out.println("t1 = null, t2.val = " + t2.val);
            return t2;
        }

        if (t2 == null) {
           // System.out.println("t2 = null, t1.val = " + t1.val);
            return t1;
        }

        //System.out.println("t1.val = " + t1.val + ", t2.val = " + t2.val);

        t1.val += t2.val;

        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);

        return t1;
    }
}
