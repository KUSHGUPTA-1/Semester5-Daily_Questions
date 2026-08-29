public class Count_Subsequesnces_Divisible_By_N {
    public int countSubsequences(String s,int n){
        long MOD = 1000000007L;
        long[] dp = new long[n];
        for (char ch : s.toCharArray()) {
            int d = ch - '0';
            long[] next = dp.clone();
            next[d % n]++;
            for (int r = 0; r < n; r++) {
                int nr = (r * 10 + d) % n;
                next[nr] = (next[nr] + dp[r]) % MOD;
            }
            dp = next;
        }
        return (int)(dp[0] % MOD);
        //TC->O(n*len(s)).
        //SC->O(n).
    }
}
