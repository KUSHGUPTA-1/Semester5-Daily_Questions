import java.util.*;
public class The_Fair_Nut_And_String_Codeforces{
    static int MOD=1000000007;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        long pre=0;
        long ans=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='a'){
                ans+=pre+1;
                ans%=MOD;
            }
            else if(s.charAt(i)=='b'){
                pre=ans;
            }
        }
        System.out.println(ans);
        //TC: O(n) for iterating through the string once, O(1) for each character
        //SC: O(1) for storing variables, O(n) for input string
    }
}
