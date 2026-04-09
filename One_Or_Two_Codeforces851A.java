import java.util.*;
public class One_Or_Two_Codeforces851A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int c=0;
            for(int i=0;i<n;i++){
                if(arr[i]==2){
                    c++;
                }
            }
            if(c==0){
                System.out.println(1);
            }
            else if(c%2!=0){
                System.out.println(-1);
            }
            else{
                int need=c/2;
                int cnt=0;
                for(int i=0;i<n;i++){
                    if(arr[i]==2){
                        cnt++;
                    }
                    if(cnt==need){
                        System.out.println(i+1);
                        break;
                    }
                }
            }
        }
        sc.close();
        //TC: O(n) for each test case, where n is the length of the
        //SC: O(n) for the input array arr.
    }
}
