import java.util.*;
class Reverse_Degree_Of_A_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseDegree(s));
        sc.close();
    }
    public static int reverseDegree(String s){
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            sum+=(i+1)*('z'-ch+1);  //as position started from 1 and for reverse mapping we used ('z'-ch+1).
        }
        return sum;
        //TC->O(N).
        //SC->O(1).
    }
}