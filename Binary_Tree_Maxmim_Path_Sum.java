class Binary_Tree_Maximum_Path_Sum{
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }
    public int helper(TreeNode root){
        if(root==null) return 0;
        int left=Math.max(0,helper(root.left));
        int right=Math.max(0,helper(root.right));
        int currmax=root.val+left+right;
        max=Math.max(max,currmax);
        return root.val+Math.max(left,right);
    }
}