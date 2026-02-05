
import java.util.*;
class Maximum_XOR_After_Operations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();  //input array elements.
        }
        System.out.println(maximumXOR(nums));
        sc.close();
    }
    public static int maximumXOR(int[] nums) {
        int xor=0;
        for(int num:nums){
            xor|=num;
        }
        return xor;
        //TC->O(N).
        //SC->O(1).
    }
}