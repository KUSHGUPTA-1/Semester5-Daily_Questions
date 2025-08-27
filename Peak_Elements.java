public class Peak_Elements {
    public int findPeakElement(int[] nums) {
        int beg=0;
        int end=nums.length-1;
        int ans=-1;
        while(beg<end){
            int mid=beg+(end-beg)/2;
            if(nums[mid]>nums[mid+1]){
                ans=mid;
                end=mid;
            }
            else{
                beg=mid+1;
            }
        }
        return ans;
    }
}
