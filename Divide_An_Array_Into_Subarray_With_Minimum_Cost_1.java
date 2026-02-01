public class Divide_An_Array_Into_Subarray_With_Minimum_Cost_1 {
    public int minimumCost(int[] nums) {
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                ans=Math.min(ans,nums[0]+nums[i]+nums[j]);
            }
        }
        return ans;
        //TC->O(N^2).
        //SC->O(1).
    }
}
