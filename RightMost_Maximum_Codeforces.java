import java.util.*;
public class RightMost_Maximum_Codeforces {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            Stack<Integer> st= new Stack<>();
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                if(st.isEmpty()) st.push(a);
                else if(st.peek()<=a){
                    st.push(a);
                }
            }
            System.out.println(st.size());
        }
        //TC->O(n).
        //SC->O(n).
    }
}