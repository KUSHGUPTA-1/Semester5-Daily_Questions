// Problem Statement: Given two strings word1 and word2, return the minimum number of steps required to make word1 and word2 the same. In one step, you can delete exactly one character in either string.
// You can find the problem statement here: https://leetcode.com/problems/delete-operations-for-two-strings/

// Solution: It is done Using Dynamic Programming to find the Longest Common Subsequence (LCS) between the two strings. 
// The minimum number of deletions required to make the two strings the same is equal to the sum of the lengths of both strings minus twice the length of their LCS.
public class Delete_Operations_For_Two_Strings {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int lcs=dp[n][m];
        return n+m-2*lcs;
        // Time Complexity: O(n * m) where n and m are lengths of word1 and word2 respectively
        // Space Complexity: O(n * m)
    }
}
