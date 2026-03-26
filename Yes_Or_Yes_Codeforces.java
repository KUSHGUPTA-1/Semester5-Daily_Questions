import java.util.*;
public class Yes_Or_Yes_Codeforces{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int cy=0;
            int cn=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='Y'){
                    cy++;
                }
                else{
                    cn++;
                }
            }
            if(cy<=1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}