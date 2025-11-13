public class Maximum_Number_Of_Operation_To_Move_Ones_To_End {
    public int maxOperations(String s) {
        int ones = 0;      // Count of '1's seen so far
        int ans = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == '1') {
                ones++;
            } 
            // c == '0' AND it's the end of a zero block
            else if (i + 1 == n || s.charAt(i + 1) == '1') {
                ans += ones;
            }
        }
        return ans;
    }
}
