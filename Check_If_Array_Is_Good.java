import java.util.*;
class Check_If_Array_Is_Good {
    public boolean isGood(int[] nums){
        Arrays.sort(nums);
        int n=nums.length;
        if(nums[n-1]!=n-1){
            return false;
        }
        for(int i=0;i<n-1;i++){
            if(nums[i]!=i+1){
                return false;
            }
        }
        return true;
        // Time Complexity: O(nlogn) due to sorting.
        // Space Complexity: O(1) if we ignore the space used by sorting, otherwise
    }
}