public class Make_Array_Elements_Equal_To_Zero {
    public int countValidSelections(int[] nums) {
        int c=0,n=nums.length;
        int sum=0,halfSum=0;
        for(int num:nums)sum+=num;
        for(int i=0;i<n;i++){
            halfSum+=nums[i];
            if(nums[i]==0){
                if(2*halfSum==sum){
                    c+=2;
                } 
                else if(Math.abs(sum-2*halfSum)==1){
                    c++;
                } 
            }
        }
        return c;
        //TC->O(n)
        //SC->O(1)
    }
}
