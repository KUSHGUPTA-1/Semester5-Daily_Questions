import java.util.*;
public class Remove_Duplicates_From_Sorted_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums=new int[n];
        int k=removeDuplicates(nums);
        for(int i=0;i<k;i++){
            System.out.print(nums[i]+" ");
        }
        sc.close();
    }
    public static int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
        //TC O(n)
        // SC O(1)
    }
}
