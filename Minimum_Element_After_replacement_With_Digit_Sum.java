public class Minimum_Element_After_replacement_With_Digit_Sum {
    public int minElement(int[] nums) {
        int n=nums.length;
        int i=0;
        for(int num:nums){
            int sum=0;
            while(num!=0){
                int r=num%10;
                sum+=r;
                num/=10;
            }
            nums[i]=sum;
            i++;
        }
        int min=nums[0];
        for(i=0;i<n;i++){
            min=Math.min(min,nums[i]);
        }
        return min;
        //TC:O(n) where n is the length of the array.
        //SC:O(1) as we are using only constant space.
    }
}
