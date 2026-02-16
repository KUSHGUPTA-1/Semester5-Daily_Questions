import java.util.*;

public class Binary_Tree_PreOrder_Traversal {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {
        }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class Pair{
        TreeNode root;
        int state;
        Pair(TreeNode root,int state){
            this.root=root;
            this.state=state;
        }
    }
    class Main {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder=new ArrayList<>();
        if(root==null) return preorder;
        Stack<Pair> st=new Stack<>();
        st.push(new Pair(root,1));
        while(!st.isEmpty()){
            Pair top=st.pop();
            //1st state.
            if(top.state==1){
                preorder.add(top.root.val);
                top.state++;
                st.push(top);
                if(top.root.left!=null){
                    st.push(new Pair(top.root.left,1));
                }
            }
            //2nd state.
            else if(top.state==2){
                top.state++;
                st.push(top);
                if(top.root.right!=null){
                    st.push(new Pair(top.root.right,1));
                }
            }
            //3rd state.
        }
        return preorder;
        //TC:O(n)
        //SC:O(n)
    }
}
}
