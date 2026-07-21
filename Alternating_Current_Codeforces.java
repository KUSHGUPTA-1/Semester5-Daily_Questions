import java.util.*;
public class Alternating_Current_Codeforces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<n;i++){
            if(st.size()==0 || st.peek()!=s.charAt(i)){
                st.push(s.charAt(i));
            }
            else if(st.peek()==s.charAt(i)){
                st.pop();
            }
        }
        if(st.size()==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        //TC->O(n).
        //SC->O(n).
    }
}
