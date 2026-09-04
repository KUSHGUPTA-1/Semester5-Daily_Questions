public class Smallest_Stable_Index1 {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int max=nums[0];
        int min=nums[0];
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            min=nums[i];
            for(int j=i;j<n;j++){
                min=Math.min(min,nums[j]);
            }
            if(max-min<=k){
                return i;
            }
        }
        return -1;
        //TC-> O(n^2). 
        //SC-> O(1).
    }
}
