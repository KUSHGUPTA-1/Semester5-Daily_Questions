public class Longest_Subarray_Of_Ones_After_Deleting_Element {
    public int longestSubarray(int[] nums) {
        int zeros=0;
        int ones=0;
        int left=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeros++;
            }
            while(zeros>1){
                if(nums[left]==0){
                    zeros--;
                }
                left++;
            }
            ones=Math.max(ones,i-left);
        }
        return ones;
    }
}
