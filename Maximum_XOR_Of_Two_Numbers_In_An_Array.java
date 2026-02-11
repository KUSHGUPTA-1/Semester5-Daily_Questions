public class Maximum_XOR_Of_Two_Numbers_In_An_Array {
    public int findMaximumXOR(int[] nums){
        //Brute Force Approach.
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans=Math.max(ans,nums[i]^nums[j]);
            }
        }
        return ans;


        //Optimised Approachh.
        // int max=0;
        // int mask=0;
        // for (int bit = 31; bit >= 0; bit--) {
        //     mask |= (1 << bit);
        //     Set<Integer> set = new HashSet<>();
        //     for (int num : nums) {
        //         set.add(num & mask);
        //     }
        //     int candidate = max | (1 << bit);
        //     for (int prefix : set) {
        //         if (set.contains(prefix ^ candidate)) {
        //             max = candidate;
        //             break;
        //         }
        //     }
        // }
        // return max;
    }
}
