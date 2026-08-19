import java.util.*;
public class Triplets_With_Sum_In_Range {
    public long countTriplets(int[] arr, int l, int r) {
        Arrays.sort(arr);
        return count(arr, r) - count(arr, l - 1);
    }
    long count(int[] arr, long target) {
        int n = arr.length;
        long ans = 0;

        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                long sum = (long) arr[i] + arr[j] + arr[k];

                if (sum <= target) {
                    ans += k - j;
                    j++;
                } else {
                    k--;
                }
            }
        }

        return ans;
    }
}
