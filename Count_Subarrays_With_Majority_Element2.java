import java.util.*;
class Count_Subarrays_With_Majority_Element2{
    class Fenwick {
        int[] bit;
        Fenwick(int n) {
            bit = new int[n + 2];
        }
        void update(int idx, int val) {
            while (idx < bit.length) {
                bit[idx] += val;
                idx += idx & -idx;
            }
        }
        int query(int idx) {
            int sum = 0;
            while (idx > 0) {
                sum += bit[idx];
                idx -= idx & -idx;
            }
            return sum;
        }
    }
    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int[] pre = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            pre[i] = pre[i - 1] + (nums[i - 1] == target ? 1 : -1);
        }
        int[] temp = pre.clone();
        Arrays.sort(temp);
        HashMap<Integer, Integer> map = new HashMap<>();
        int idx = 1;
        for (int x : temp) {
            if (!map.containsKey(x)) {
                map.put(x, idx++);
            }
        }
        Fenwick bit = new Fenwick(idx);
        long ans = 0;
        bit.update(map.get(pre[0]), 1);
        for (int i = 1; i <= n; i++) {
            int id = map.get(pre[i]);
            ans += bit.query(id - 1);
            bit.update(id, 1);
        }
        return ans;
    }
}