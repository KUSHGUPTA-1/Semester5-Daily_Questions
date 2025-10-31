import java.util.*;
public class The_Two_Sneaky_Numbers_Of_Digitville {
    public int[] getSneakyNumbers(int[] nums) {
        int c=0;
        Arrays.sort(nums);
        int ans[]=new int[2];
        int index=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                ans[index++]=nums[i];
            }
            if(index==2){
                break;
            }
        }
        return ans;
        //TC-> O(n log n)
        //SC-> O(1)
    }
}
