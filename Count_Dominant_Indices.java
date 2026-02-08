public class Count_Dominant_Indices {
    public int dominantIndices(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n-1;i++){
            int sum=0;
            int ele=0;
            for(int j=i+1;j<n;j++){
                sum+=nums[j];
                ele++;
            }
            double avg=(double) sum/ele;
            if(nums[i]>avg){
                c++;
            }
        }
        return c;
        //TC->O(N^2).
        //SC->O(1).
    }
}
