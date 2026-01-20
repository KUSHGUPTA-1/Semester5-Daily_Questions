import java.util.*;
public class Backspace_String_Compare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        System.out.println(backspaceCompare(s,t));
        sc.close();
    }
    public static boolean backspaceCompare(String s,String t){
        return Build(s).equals(Build(t));
    }
    public static String Build(String str){
        //Make a stack to store characters after the backspace logic.
        Stack<Character> st=new Stack<>();
        for(char ch:str.toCharArray()){
            //if current character is # and stack is not empty then pop the top character.
            if(ch=='#'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            //Otherwise push the character to the stack.
            else{
                st.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        //Returning the final string after the backspace processing..
        return sb.toString();
        //TC->O(N)
        //SC->O(N)
    }
}
