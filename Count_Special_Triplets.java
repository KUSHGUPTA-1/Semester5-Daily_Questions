import java.util.*;
class Count_Special_Triplets {
    public int specialTriplets(int[] nums) {
        int n = nums.length;
        int mod = 1_000_000_007;
        int count = 0;
        // Map to store frequency of elements before current j
        Map<Integer, Integer> left = new HashMap<>();
        // Map to store frequency of elements after current j
        Map<Integer, Integer> right = new HashMap<>();
        for (int num : nums) {
            right.put(num, right.getOrDefault(num, 0) + 1);
        }
        for (int j = 0; j < n; j++) {
            right.put(nums[j], right.get(nums[j]) - 1);
            int a = nums[j] * 2;
            count = (int)((count + (long)left.getOrDefault(a, 0) * right.getOrDefault(a, 0)) % mod);
            left.put(nums[j], left.getOrDefault(nums[j], 0) + 1);
        }
        return count;
    }
}