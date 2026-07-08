public class Concatenate_Array_With_Reverse {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int ans[]=new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[n-i-1];
        }
        return ans;
        //TC->O(N).
        //Sc->O(N).
    }
}
