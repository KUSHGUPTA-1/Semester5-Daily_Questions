class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    // Constructor
    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class Root_Equals_Sum_Of_Children {
    // Function to check if root value equals sum of children
    public static boolean checkTree(TreeNode root) {
        // Edge case (though problem guarantees 2 children)
        if (root == null || root.left == null || root.right == null) {
            return false;
        }
        return root.val == root.left.val + root.right.val;
    }
    // Main function
    public static void main(String[] args) {
        // Creating tree:
        //        10
        //       /  \
        //      4    6
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(4);
        root.right = new TreeNode(6);
        System.out.println(checkTree(root));  // Output: true
    }
}
