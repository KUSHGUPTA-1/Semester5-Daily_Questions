import java.util.*;
public class C_And_Codeforces{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int[] a=new int[3];
            for(int i=0;i<3;i++) a[i]=sc.nextInt();
            int xorSum=a[0]^a[1]^a[2];
            Arrays.sort(a);
            System.out.println(xorSum-a[1]);
        }
        sc.close();
        //TC-> O(t) for t test cases, O(1) for each test case
        //SC->O(1).
    }
}