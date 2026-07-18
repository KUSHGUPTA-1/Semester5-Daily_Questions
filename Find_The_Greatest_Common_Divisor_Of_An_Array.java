class Find_The_Greatest_Common_Divisor_Of_An_Array{
    public int findGCD(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        int min=nums[0];
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        return gcd(max,min);
    }
    public int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    //TC->O(N).
    //SC->O(1).
}