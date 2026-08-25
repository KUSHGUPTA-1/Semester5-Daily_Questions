import java.util.*;
public class Smallest_Missing_Multuiple_Of_K {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int curr=k;
        while(set.contains(curr)){
            curr+=k;
        }
        return curr;
        //TC->O(N).
        //SC->O(N).
    }
}
