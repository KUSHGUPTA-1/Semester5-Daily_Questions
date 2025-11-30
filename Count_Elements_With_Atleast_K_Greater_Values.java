import java.util.Arrays;
public class Count_Elements_With_Atleast_K_Greater_Values {
    public int countElements(int[] nums, int k) {
        if(k==0){
            return nums.length;
        }
        Arrays.sort(nums);
        int klargest=nums[nums.length-k];
        int c=0;
        for(int val:nums){
            if(val<klargest){
                c++;
            }
        }
        return c;
        //TC->O(NlogN) due to sorting.
        //SC->O(1).
    }
}
