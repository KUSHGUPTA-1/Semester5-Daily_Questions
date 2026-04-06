import java.util.*;
public class Two_Buttons_Codeforces295B {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int w=0; //Steps.
        while(n!=m){
            if(m>n){
                if(m%2==0){
                    m/=2;
                    w++;
                }
                else{
                    m++;
                    w++;
                }
            }
            else{
                m++;
                w++;
            }
        }
        System.out.println(w);
        //TC->O(logN) in the worst case when m is much greater than n.
        //SC->O(1) as we are using only a constant amount of extra space
    }
}