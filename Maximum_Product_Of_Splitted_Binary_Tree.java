// import javax.swing.tree.TreeNode;
import java.util.*;
public class Maximum_Product_Of_Splitted_Binary_Tree {
    public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
        }
    }
    static long tsum=0;
    static long maxp=0;
    static int mod=1000000007;
    public static int maxProduct(TreeNode root) {
        tsum=treesum(root);
        dfs(root);
        return (int)(maxp%mod);
    }
    public static long treesum(TreeNode node){
        if(node==null) return 0;
        return node.val+treesum(node.left)+treesum(node.right);
    }
    public static long dfs(TreeNode node){
        if(node==null) return 0;
        long left=dfs(node.left);
        long right=dfs(node.right);
        long subtreesum=node.val+left+right;
        long product=subtreesum*(tsum-subtreesum);
        maxp=Math.max(maxp,product);
        return subtreesum;
    }
}
