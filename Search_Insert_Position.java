public class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        int beg=0;
        int end=nums.length-1;
        while(beg<=end){
            int mid=beg+(end-beg)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                beg=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return beg;
        //OR
        // int c=0;
        // for(int num:nums){
        //     if(num<target){
        //         c++;
        //     }
        // }
        // return c;
        //Time Complexity: O(log n)
        //Space Complexity: O(1)
    }
}
