import java.util.*;
class Append_K_Integers_With_Minimal_Sum {
    public long minimalKSum(int[] nums,int k){
        Arrays.sort(nums);
        Set<Integer> set=new HashSet<>();
        long sum=0;
        for(int num:nums){
            if(!set.contains(num) && num<=k){
                k++;
                sum+=num;        
            }            
            set.add(num);
        }
        long res=(long)(1+k)*k/2-sum;
        return res;
        //TC->O(N log N).
        //SC->O(N).    
    }
}