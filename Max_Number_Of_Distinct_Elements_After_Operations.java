import java.util.Arrays;

public class Max_Number_Of_Distinct_Elements_After_Operations {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=0;
        long c=Long.MIN_VALUE;
        for(int i:nums){
            long l=(long)i-k;
            long r=(long)i+k;
            if(c<l){
                c=l;
            }
            if(c<=r){
                ans++;
                c++;
            }
        }
        return ans;
        //TC->O(n log n)
        //SC->O(1)
    }
}
