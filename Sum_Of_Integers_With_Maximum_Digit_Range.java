public class Sum_Of_Integers_With_Maximum_Digit_Range{
    public int maxDigitRange(int[] nums) {
        int mx=-1;
        int sum=0;
        for(int num:nums){
            int x=num;
            int min=9;
            int max=0;
            while(x>0){
                int r=x%10;
                min=Math.min(min,r);
                max=Math.max(max,r);
                x/=10;
            }
            int rang=max-min;
            if(rang>mx){
                mx=rang;
                sum=num;
            }
            else if(rang==mx){
                sum+=num;
            }
        }
        return sum;
        //TC->O(N*D), where D is the number of digits in the number.
        //SC->O(1).
    }
}
