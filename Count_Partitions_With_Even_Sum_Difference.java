public class Count_Partitions_With_Even_Sum_Difference {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int prefix[]=new int[n];
        int suffix[]=new int[n];
        prefix[0]=nums[0];
        suffix[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]+nums[i];
        }
        int c=0;
        for(int i=0;i<n-1;i++){
            if((prefix[i]-suffix[i+1])%2==0){
            c++;
            }
        }
        return c;
    }
}
