public class Minimum_Moves_To_Equal_Array_Elements {
    public int minMoves(int[] nums) {   //Totalcount - minimum no.times length of array.
        int n=nums.length;
        int sum=0;
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return sum-min*n;
        //TC->O(n).
        //SC->O(1).
    }
}
