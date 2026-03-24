import java.util.*;
public class Equal_Values_Codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            long ans = Long.MAX_VALUE;
            int i = 0;
            while (i < n) {
                int j = i;
                // find length of this segment
                while (j < n && a[j] == a[i]) j++;
                int len = j - i;
                int val = a[i];
                long cost = (long)(n - len) * val;
                ans = Math.min(ans, cost);
                i = j; // jump to next segment
            }
            System.out.println(ans);
        }
        sc.close();
    }
}