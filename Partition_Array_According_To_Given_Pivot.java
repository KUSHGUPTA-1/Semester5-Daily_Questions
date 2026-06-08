public class Partition_Array_According_To_Given_Pivot {
    public int[] pivotArray(int[] nums, int pivot) {
        int arr[]=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        for(int i=0,j=nums.length-1;i<nums.length;i++,j--){
            if(nums[i]<pivot){
                arr[left]=nums[i];
                left++;
            } 
            if(nums[j]>pivot){
                arr[right]=nums[j];
                right--;
            }
        }
        while(left<=right){
            arr[left]=pivot;
            left++;
        }
        return arr;
        //SC->O(N)
        //TC->O(N)
    }
}
