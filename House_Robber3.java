class House_Robber3{
 //Definition for a binary tree node.
 public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val;}
      TreeNode(int val, TreeNode left, TreeNode right){
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    //Brute Force Using Recursion.
    //Optimisation using 
    public int rob(TreeNode root){
        // boolean flag=true;
        // return dfs(root,flag);
        int ans[]=dfs(root);
        return Math.max(ans[0],ans[1]);
    }
    public int[] dfs(TreeNode root){ 
        if(root==null){
            return new int[]{0,0};
        }
        int left[]=dfs(root.left);
        int right[]=dfs(root.right);
        int ans[]=new int[2];
        ans[0]=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        ans[1]=root.val+left[0]+right[0];
        return ans;
    }
    // public int dfs(TreeNode root,boolean flag){
    //     if(root==null) return 0;
    //     if(flag==true){
    //         int inc=root.val+dfs(root.left,false)+dfs(root.right,false);
    //         int exc=dfs(root.left,true)+dfs(root.right,true);
    //         return Math.max(inc,exc);
    //     }
    //     else{
    //         return dfs(root.left,true)+dfs(root.right,true);
    //     }
    //     //TC->O(2^n).
    //     //SC->O(h). 
    // }
    //By Applying tree dp(Take,Not take) Approach.
}