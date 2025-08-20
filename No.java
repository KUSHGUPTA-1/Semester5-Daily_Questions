public class No.Of_Zero_Filled_Subarrays {
    public long zeroFilledSubarray(int[] nums) {
        long c=0;
        long ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c++;        //Count how many time 0 occurs.
                ans+=c;     //Add subarrays ending here
            }
            else{
                c=0;        //If non zero element then reset count c to zero.
            }
        }
        return ans;
    }
}
