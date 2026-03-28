import java.util.*;
public class AntiMedian_Deletion_Codeforces_1088A {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            if(n==1){
                System.out.println(1);
            }
            else{
                for(int it=0;it<n;it++){
                    System.out.println(2);
                    if(it!=n-1){
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
        //TC: O(t*n)   
        //SC: O(n) for storing the array, O(1) for output. Overall O(n).
    }
}
