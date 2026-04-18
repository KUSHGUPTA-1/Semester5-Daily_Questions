import java.util.*;
class Mirror_Distance_Of_An_Integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  //123
        System.out.println(mirrorDistance(n));
        sc.close();
    }
    public static int mirrorDistance(int n) {
        int rev=reverse(n);
        return Math.abs(rev-n);
    }
    public static int reverse(int n){
        int ans=0;
        while(n>0){
            int dig=n%10;
            ans=ans*10+dig;
            n=n/10;
        }
        return ans;
        //TC->O(N).
        //SC->O(1).
    }
}