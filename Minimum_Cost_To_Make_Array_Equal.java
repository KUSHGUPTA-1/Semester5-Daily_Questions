import java.util.Arrays;

public class Minimum_Cost_To_Make_Array_Equal {
    public long minCost(int[] nums, int[] cost) {
        int n=nums.length;
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=nums[i];
            arr[i][1]=cost[i];
        }
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        long totalcost=0;
        for(int num:cost){
            totalcost+=num;
        }
        long half=(totalcost+1)/2;
        long curr=0;
        int median=0;
        for(int i=0;i<n;i++){
            curr+=arr[i][1];
            if(curr>=half){
                median=arr[i][0];
                break;
            }
        }
        long ans=0L;
        for(int i=0;i<n;i++){
            ans+=1L*Math.abs(nums[i]-median)*cost[i];
        }
        return ans;
    }
}
