import java.util.*;
public class Largest_Possible_Integer_That_Exists_With_Its_Negative {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int ans=-1;
        for(int num:nums){
            if(set.contains(-num)){
                ans=Math.max(ans,Math.abs(num));
            }
            set.add(num);
        }
        return ans;
        //TC->O(n).
        //SC->O(n).
    }
}
