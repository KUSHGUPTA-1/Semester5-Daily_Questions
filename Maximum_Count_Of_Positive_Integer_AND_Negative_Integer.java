class Maximum_Count_Of_Positive_Integer_AND_Negative_Integer{
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int cn=0,cp=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                cn++;
            }
            else if(nums[i]>0){
                cp++;
            }
        }
        return Math.max(cn,cp);
        //TC->O(N)
        //SC->O(1)
    }
}