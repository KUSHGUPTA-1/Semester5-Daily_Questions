import java.util.*;
public class Sending_A_Sequence_Over_The_Network_Codeforces1741E{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int b[]=new int[n+1];
            for(int i=1;i<=n;i++){
                b[i]=sc.nextInt();
            }
            boolean dp[]=new boolean[n+1];
            dp[0]=true;
            for(int i=1;i<=n;i++){
                if(i+b[i]<=n && dp[i-1]){
                    dp[i+b[i]]=true;
                }
                if(i-b[i]-1>=0 && dp[i-b[i]-1]){
                    dp[i]=true;
                }
            }
            if(dp[n]){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
        //TC: O(n) for each test case, where n is the length of the
        //SC: O(n) for the dp array and the input array b.
    }
}