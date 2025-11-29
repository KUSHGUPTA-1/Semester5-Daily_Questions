public class Minimum_Operations_To_Make_Array_Sum_Divisible_By_K {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum%k;
        //TC->O(N).
        //SC->O(1).
    }
}
