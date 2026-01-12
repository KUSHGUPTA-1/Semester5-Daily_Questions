public class Movement_Of_Robots {
    public int sumDistance(int[] nums, String s, int d) {
        int n=nums.length;
        long arr[]=new long[n];
        long mod=1000000007;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='L'){
                arr[i]=(long)nums[i]-d;
            }
            else{
                arr[i]=(long)nums[i]+d;
            }
        }
        Arrays.sort(arr);
        long sum=0;
        long ans=0;
        //Now questions become like this only 
        // Given final positions of all robots, find sum of |pos[i] - pos[j]| for all i < j.
        // Efficient distance sum (O(n)) Instead of nested loops (O(n²)), use prefix sum idea.
        // ans = arr[i]*i-sum_of_previous_elements
        for(int i=0;i<n;i++){
            ans=(ans+arr[i]*i-sum)%mod;
            sum+=arr[i];

        }
        return (int)((ans+mod)%mod);
        //TC:O(nlogn) for sorting + O(n) for single traversal
        //SC:O(n) for arr
    }
}
