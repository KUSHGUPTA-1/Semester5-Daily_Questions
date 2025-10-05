import java.util.*;
public class Wildcard_Matchmaking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String p=sc.next();
        System.out.println(ismatch(s,p));
    }
    public static boolean ismatch(String s,String p)
    {
        int m=s.length();
        int n=p.length();
        boolean dp[][]=new boolean [m+1][n+1];
        dp[0][0]=true;
        for(int i=1;i<=n;i++)
        {
            if(p.charAt(i-1)=='*')
            dp[0][i]=dp[0][i-1];
        }
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                char sc=s.charAt(i-1);
                char pc=p.charAt(j-1);
                if(sc==pc || pc=='?')
                {
                    dp[i][j]=dp[i-1][j-1];
                }
                else if(pc=='*'){
                    dp[i][j]=dp[i-1][j] || dp[i][j-1];
                }
            }
        }
        return dp[m][n];
    }
}
