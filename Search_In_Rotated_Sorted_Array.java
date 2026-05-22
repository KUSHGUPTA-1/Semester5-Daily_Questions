import java.util.*;
public class Search_In_Rotated_Sorted_Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n]; //{4,5,6,7,0,1,2}
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        int ans=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[i]<=nums[mid]){  //left half mai searching.
                if(target>=nums[i] && target<nums[mid]){
                    j=mid-1;
                }
                else{
                    i=mid+1;
                }
            }
            else{
                if(target>nums[mid] && target<=nums[j]){
                    i=mid+1;
                }
                else{
                    j=mid-1;
                }
            }
        }
        return ans;
        //TC->O(log n).
        //SC->O(1).
    }
}
