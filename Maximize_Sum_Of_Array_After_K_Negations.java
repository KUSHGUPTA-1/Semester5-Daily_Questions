import java.util.*;
public class Maximize_Sum_Of_Array_After_K_Negations {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0 && k>0){
                nums[i]=-nums[i];
                k--;
            }
        }
        Arrays.sort(nums);
        if(k%2!=0){
            nums[0]=-nums[0];
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
        //TC->O(NlogN).
        //SC->O(1).
    }
}
