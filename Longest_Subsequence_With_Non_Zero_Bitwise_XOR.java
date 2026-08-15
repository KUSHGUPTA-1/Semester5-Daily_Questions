import java.util.*;
public class Longest_Subsequence_With_Non_Zero_Bitwise_XOR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(longestSubsequence(nums));
        sc.close();
    }
    public static int longestSubsequence(int[] nums) {
        int n=nums.length;
        int xor=0;
        boolean zero=true;
        for(int i=0;i<n;i++){
            xor^=nums[i];
            if(nums[i]!=0)zero=false;
        }
        if(zero)return 0;
        if(xor!=0) return n;
        else return n-1;
        //TC->O(N).
        //SC->O(1).
    }
}
