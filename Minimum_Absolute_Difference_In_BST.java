public class Minimum_Absolute_Difference_In_BST {
    int prev = -1;
    int minDiff = Integer.MAX_VALUE;
    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        if(prev != -1){
            minDiff = Math.min(minDiff, root.val - prev);
        }
        prev = root.val;
        inorder(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
        left=null;
        right=null;
    }
}
