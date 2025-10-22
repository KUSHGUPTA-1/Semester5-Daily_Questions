public class Validate_Binary_Serach_Tree {
    public boolean isValidBST(TreeNode root) {
        // BstPair ans = ValidBst(root);
        // return ans.isbst;
        if(root==null) return false;
        return helper(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean helper(TreeNode node,long min,long max){
        if(node==null) return true;
        if(node.val<=min || node.val>=max) return false;
        return helper(node.left,min,node.val) && helper(node.right,node.val,max);
    }
}
