import java.util.*;
public class Rotate_Digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(rotatedDigits(n));
        sc.close();
    }
    public static int rotatedDigits(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            String s=Integer.toString(i);
            if(s.contains("3") || s.contains("4") || s.contains("7")){
                continue;
            }
            else if(s.contains("2") || s.contains("5") || s.contains("6") || s.contains("9")){
                c++;
            }
        }
        return c;
        //TC->O(N)
        //SC->O(1)
    }
}
