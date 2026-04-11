import java.util.*;
public class Only_One_Digit_Codeforces2126A {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int min=9; //Integer.MIN_VALUE i.e. 9 for here.
            while(n!=0){
                int r=n%10;
                min=Math.min(min,r);
                n/=10;
            }
            System.out.println(min);
        }
        sc.close();
        //TC: O(t*log(n)) for t test cases, O(log(n))
        //SC: O(1) for storing the input and output, O(1) for other
    }
} 
