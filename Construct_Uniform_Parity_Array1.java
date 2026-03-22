import java.util.*;
public class Construct_Uniform_Parity_Array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(uniformArray(arr));
        sc.close();
    }   
    public static boolean uniformArray(int[] nums1) {
        return true;
    }
}
