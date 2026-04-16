import java.util.*;
public class Defuse_The_Bomb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int code[]=new int[n];
        for(int i=0;i<n;i++){
            code[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int ans[]=decrypt(code,k);
        for(int num:ans){
            System.out.print(num+" ");
        }
        sc.close();
    }
    public static int[] decrypt(int[] code, int k) {
        int n=code.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            if(k>0){
                for(int j=1;j<=k;j++){
                    sum+=code[(i+j)%n];
                }
            }
            else{
                for(int j=1;j<=-k;j++){
                    sum+=code[(i-j+n)%n];
                }
            }
            ans[i]=sum;
        }
        return ans;
        //TC->O(n*k).
        //SC->O(1).
    }
}
