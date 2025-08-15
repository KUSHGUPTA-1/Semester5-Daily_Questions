/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return createTree(inorder,postorder,0,inorder.length-1,0,postorder.length-1);
    }
    public TreeNode createTree(int in[],int post[],int ilo,int ihi,int plo,int phi){
        if(ilo>ihi || plo>phi){
            return null;
        }
        TreeNode node=new TreeNode(post[phi]);  //Root element is last element.
        int idx=Search(in,ilo,ihi,post[phi]);  //Index of root in inorder.
        int c=idx-ilo; //Leftcount(No. of ele in left subtree)
        node.left=createTree(in,post,ilo,idx-1,plo,plo+c-1);
        node.right=createTree(in,post,idx+1,ihi,plo+c,phi-1);
        return node;
    }
    public int Search(int in[],int ilo,int ihi,int item){
        for(int i=ilo;i<=ihi;i++){
            if(in[i]==item){
                return i;
            }
        }
        return -1;
    }
}