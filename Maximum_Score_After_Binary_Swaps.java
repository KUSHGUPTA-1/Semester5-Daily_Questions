import java.util.*;
public class Maximum_Score_After_Binary_Swaps {
    public long maximumScore(int[] nums, String s) {
        long c=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<s.length();i++){
            pq.add(nums[i]);
            if(s.charAt(i)=='1'){
                c+=pq.poll();
            }
        }
        return c;
        //TC->O(n log n).
        //SC->O(n).
    }
}
