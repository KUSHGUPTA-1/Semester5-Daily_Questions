public class Check_If_All_Ones_Are_Atleast_K_Places_Away {
    public boolean kLengthApart(int[] nums, int k) {
        int prev=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(prev!=-1 && i-prev-1<k){
                    return false;
                }
                prev=i;
            }
        }
        return true;
        //TC->O(n)
        //SC->O(1)
    }
}
