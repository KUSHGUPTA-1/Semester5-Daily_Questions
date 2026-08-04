import java.util.*;
public class Find_Missing_Elements {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        int min=nums[0];
        int max=nums[0];
        for(int i=0;i<n;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        Arrays.sort(nums);
        int idx=0;
        for(int i=min;i<max;i++){
            if(nums[idx]==i){
                while(nums[idx+1]==i){
                    idx++;
                }
                idx++;
            }
            else{
                ans.add(i);
            }
        }
        return ans;
        //TC->O(N log N).
        //SC->O(N).
    }
}
