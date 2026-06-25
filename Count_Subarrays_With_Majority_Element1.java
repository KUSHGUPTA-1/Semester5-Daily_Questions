import java.util.*;
public class Count_Subarrays_With_Majority_Element1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //5
        int[] nums = new int[n]; //{1, 2, 1, 1, 3};
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target = sc.nextInt(); //1
        int result = countSubarrays(nums,target);
        System.out.println("Count of subarrays with majority element " + target + ": " + result);
    }
    public static int countSubarrays(int[] nums, int target) {
        int n=nums.length;
        int cs=0; //count of subarrays.
        for(int i=0;i<n;i++){
            int c=0; //count of elements equal to target.
            for(int j=i;j<n;j++){
                if(nums[i]==target){
                    c++;
                }
                int len=j-i+1;
                if(c>len/2){
                    cs++;
                }
            }
        }
        return cs;
        //TC->O(n^2).
        //SC->O(1).
    }
}
