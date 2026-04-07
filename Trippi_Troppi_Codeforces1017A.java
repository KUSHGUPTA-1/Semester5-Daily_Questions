import java.util.*;
public class Trippi_Troppi_Codeforces1017A {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            String c=sc.next();
            System.out.println(""+a.charAt(0)+b.charAt(0)+c.charAt(0));
        }
        sc.close();
        //TC: O(t) for t test cases, O(1) for each test
        //SC: O(1) for storing the input and output, O(n) for the input strings.
    }
}
