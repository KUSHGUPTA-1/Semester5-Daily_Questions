import java.util.*;
public class Subarray_Sum_Equals_K {
    public static void main(String[] args) {
        int[] nums={1,1,1};
        int k=2;
        System.out.println(subarraySum(nums,k));
    }
    public static int subarraySum(int[] nums, int k) {
        int count=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1); //to handle the case when sum itself is equal to k.
        for(int i=0;i<nums.length;i++){
            sum+=nums[i]; //to calculate the cumulative sum of the elements in the array.
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1); //to store the frequency of the sum in the map.
        }
        return count;
        //TC->O(N).
        //SC->O(N).
    }
}
