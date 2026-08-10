import java.util.*;
public class Absolute_Difference_Between_Maximum_And_Minimum_K_Elements {
    public int absDifference(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int sum1=0;
        int sum2=0;
        for(int i=0;i<k;i++){
            sum1+=nums[i];
        }
        for(int i=n-1;i>=n-k;i--){
            sum2+=nums[i];
        }
        return (int)Math.abs(sum1-sum2);
        //TC->O(N log N).
        //SC->O(1).
    }
}
