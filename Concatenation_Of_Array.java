public class Concatenation_Of_Array {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ans[]=new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
        //TC-> O(n)
        //SC-> O(1)
        
        //or 

        // int n = nums.length;  // ✅ Fixed: removed ()
        // int[] ans = new int[2*n];  // ✅ Fixed: changed 'ans' to 'int'
        // System.arraycopy(nums, 0, ans, 0, n);
        // System.arraycopy(nums, 0, ans, n, n);
        // return ans;  // ✅ Fixed: moved inside method
    }
}
