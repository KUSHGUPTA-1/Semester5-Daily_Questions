import java.util.*;
public class Minimum_Insertion_Steps_To_Make_String_Palindrome {
    //It is Similar to Longest Palindromic Subsequence(LPA).Just return Total Length-LPS.
    public int minInsertions(String s1) {
        StringBuilder sb=new StringBuilder(s1);
        String s2=sb.reverse().toString();
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int[n][m];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return n-fun(s1,s2,n-1,m-1,dp);
    }
    public int fun(String s1,String s2,int i,int j,int dp[][]){
        int n=s1.length();
        int m=s2.length();
        if(i<0 || i>=n || j<0 || j>=m){
            return 0;
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return 1+fun(s1,s2,i-1,j-1,dp);
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        return dp[i][j]=Math.max(fun(s1,s2,i,j-1,dp),fun(s1,s2,i-1,j,dp));
    }
}
