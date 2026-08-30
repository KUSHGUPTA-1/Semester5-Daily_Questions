public class removing_Minimum_And_Maximum_From_Array {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int minidx=0;
        int maxidx=0;
        if(n==1)return 1;
        for(int i=0;i<n;i++){
            if(nums[i]<nums[minidx]){
                minidx=i;
            }
            if(nums[i]>nums[maxidx]){
                maxidx=i;
            }
        }
        int i=Math.min(minidx,maxidx);
        int j=Math.max(minidx,maxidx);
        int front=j+1; //remove from starting.
        int back=n-i; //remove from ending.
        int both=(i+1)+(n-j); //remove from both ends.(i from start and j from end).
        int ans=Math.min(front,Math.min(back,both));
        return ans;
        //TC->O(N).
        //SC->O(1).
    }
}
