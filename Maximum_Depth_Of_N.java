import java.util.*;
public class Maximum_Depth_Of_N-Ary_Tree {
    
        static class Node {
        public int val;
        public List<Node> children;

        public Node() {
            children = new ArrayList<>();
        }

        public Node(int _val) {
            val = _val;
            children = new ArrayList<>();
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    // Function to calculate maximum depth
    public static int maxDepth(Node root) {
        if (root == null) return 0;

        int max = 0;

        for (Node child : root.children) {
            max = Math.max(max, maxDepth(child));
        }

        return 1 + max;
    
        //TC->O(n).
        //SC->O(n) in worst case when tree is skewed.
    }
}
