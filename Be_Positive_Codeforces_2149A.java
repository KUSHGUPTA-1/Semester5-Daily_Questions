import java.util.*;
public class Be_Positive_Codeforces_2149A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int c=0;
            int ans=0;
            int cz=0;
            for(int i=0;i<n;i++){
                if(arr[i]==0){
                    cz++;
                }
                if(arr[i]<0){
                    c++;
                }
            }
            if(c%2!=0){
                ans+=2;
            }
            System.out.println(ans+cz);
        }
        //TC: O(t*n) for t test cases and n elements in the array, O(1) for each test case
        //SC: O(n) for storing the input array, O(1) for other
    }
}