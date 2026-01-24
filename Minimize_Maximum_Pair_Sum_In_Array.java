import java.util.*;
public class Minimize_Maximum_Pair_Sum_In_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(minPairSum(nums));
        sc.close();
    }
    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int max=0;
        while(i<j){
            max=Math.max(max,nums[i]+nums[j]);
            i++;
            j--;
        }
        return max;
        //TC->O(N log N).
        //SC->O(1).
    }
}
