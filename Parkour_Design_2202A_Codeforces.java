import java.util.*;
public class Parkour_Design_2202A_Codeforces {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long x=sc.nextLong();
            long y=sc.nextLong();
            if((x-2*y)%3==0 && x>=2*y && x>=-4*y){
                System.out.println("YES");
            } 
            else{
                System.out.println("NO");
            }
        }
        sc.close();
        //TC: O(t) for t test cases, O(1) for each test
        //SC: O(1) for storing the input and output. Overall O(1).
    }
}

//How we get the equation.
// 2(y+c)+3b+4c = x
// 2y+2c+3b+4c = x
// 2y+6c+3b = x
// 3b+6c = x−2y
//Finally -> b+2c = (x-2y)/3;
//Let k = (x-2y)/3 eqn(1)
//b = k-2c; from eqn(1)

//Simplified Conditions.

// 1] (x−2y)%3==0
// 2] x≥2y
// 3] x≥−4y
