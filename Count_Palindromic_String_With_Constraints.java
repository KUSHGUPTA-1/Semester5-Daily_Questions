public class Count_Palindromic_String_With_Constraints {
    public int palindromicStrings(int n, int k) {
        long MOD = 1000000007L;
        long ans = 0;
        for (int len = 1; len <= n; len++) {
            int half = len / 2;
            long ways = 1;
            for (int j = 0; j < half; j++) {
                ways = ways * (k - j) % MOD;
            }
            if (len % 2 == 1) {
                ways = ways * (k - half) % MOD;
            }
            ans = (ans + ways) % MOD;
        }
        return (int) ans;
        // Time Complexity: O(n * k).
        // Space Complexity: O(1).
    }
}
