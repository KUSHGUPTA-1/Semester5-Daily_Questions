import java.util.*;
public class Binary_Tree_Postorder_Traversal {
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorder=new ArrayList<>();
        if(root==null) return postorder;
        Stack<Pair> st=new Stack<>();
        st.push(new Pair(root,1));
        while(!st.isEmpty()){
            Pair top=st.pop();
            //1st state.
            if(top.state==1){
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
            postorder.add(top.root.val);
        }
        return postorder;
        //TC:O(n)
        //SC:O(n)
    }
}
}
