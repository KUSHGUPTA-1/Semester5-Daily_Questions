import java.util.*;
public class Maximum_Sum_Codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            long[] a=new long[n];
            long total=0;
            for (int i=0;i<n;i++) {
                a[i]=sc.nextLong();
                total+=a[i];
            }
            Arrays.sort(a);
            long[] pref=new long[n+1];
            for(int i=0;i<n;i++){
                pref[i+1]=pref[i]+a[i];
            }
            long ans=0;
            for(int x=0;x<=k;x++){
                long left=pref[2*x];
                long right=pref[n]-pref[n-(k-x)];
                ans=Math.max(ans,total-left-right);
            }
            System.out.println(ans);
        }
    }
}
