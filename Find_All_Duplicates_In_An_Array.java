import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Find_All_Duplicates_In_An_Array {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int num:map.keySet()){
            if(map.get(num)==2){
                ans.add(num);
            }
        }
        return ans;
        //TC->O(N).
        //SC->O(N).//For every number x, go to index x - 1 and make that value negative. If it's already negative, x has appeared before, so it's a duplicate.
        
        
        // int n=nums.length;
        // List<Integer> ans=new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     int x=Math.abs(nums[i])-1;
        //     if(nums[x]<0){
        //         ans.add(Math.abs(nums[i]));
        //     }
        //     else{
        //         nums[x]=-nums[x];
        //     }
        // }
        // return ans;
        //TC->O(N).
        //SC->O(1).
    }
}
