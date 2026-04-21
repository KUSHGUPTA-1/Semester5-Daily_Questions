import java.util.*;
public class Maximum_Number_Of_Pairs_In_An_Array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int ans[]=numberOfPairs(nums);
        System.out.println(ans[0]+" "+ans[1]);
        sc.close();
    }
    public static int[] numberOfPairs(int[] nums) {
        int n=nums.length;
        int freq[]=new int[101];
        for(int num:nums){
            freq[num]++;  //Har no. ki frequency nikal li.
        }
        int pair=0;
        for(int f:freq){
            pair+=f/2; //check kra kitne pairs exists kr rhe hai utni baar Pairs add kre.(2 freq=1 Pair).
        }
        int left=n-2*pair; //Leftover integers in array after pairs formed.
        return new int[]{pair,left};
        //TC->O(N).
        //SC->O(1).
    }
}
