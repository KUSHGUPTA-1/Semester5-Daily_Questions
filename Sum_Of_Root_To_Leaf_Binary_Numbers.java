import javax.swing.tree.TreeNode;
import java.util.*;
public class Sum_Of_Root_To_Leaf_Binary_Numbers {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root,0);
    }
    public int dfs(TreeNode node,int curr){
        if(node==null){
            return 0;
        }
        curr=curr*2+node.val;
        if(node.left==null && node.right==null){
            return curr;
        }
        return dfs(node.left,curr)+dfs(node.right,curr);
        // Time Complexity: O(n).
        // Space Complexity: O(h), where h is the height of the tree.
    }
}
