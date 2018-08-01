package BinaryTree;

import java.util.List;

public class maxDepthforMultiTree {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
    int res = 1;
    public int maxDepth(Node root) {
        if (root == null)
            return 0;
        return dfs(root, 1);
    }

    private int dfs(Node root, int depth) {
        if (root == null)
            return 0;
        res = Math.max(res, depth);
        for (int i = 0; i < root.children.size(); i++) {
            dfs(root.children.get(i), depth + 1);
        }
        return res;
    }
}
