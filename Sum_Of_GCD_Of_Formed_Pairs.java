//Sum Of GCD Of Formed Pairs.
import java.util.*;
class Sum_Of_GCD_Of_Formed_Pairs{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(gcdSum(nums));
        
    }
    public static long gcdSum(int nums[]){
        int n=nums.length;
        int max=0;
        int pgcd[]=new int[n];
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            pgcd[i]=gcd(nums[i],max);
        }
        Arrays.sort(nums);
        int l=0;
        int r=n-1;
        long sum=0;
        while(l<r){
            sum+=gcd(nums[l],nums[r]);
            l++;
            r--;
        }
        return sum;
    }
    public static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    //TC: O(nlogn) + O(nlog(max)) + O(n/2 * log(max)) ~ O(nlogn) + O(nlog(max))
    //SC: O(n)
}