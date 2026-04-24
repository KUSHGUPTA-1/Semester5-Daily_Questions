import java.util.*;
public class Furthest_Point_From_Origin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String moves=sc.nextLine(); //Input: "L?R?L"
        System.out.println(furthestDistanceFromOrigin(moves));
        sc.close();
    }
    public static int furthestDistanceFromOrigin(String moves) {
        int n=moves.length();
        int cl=0;
        int cr=0;
        int blank=0;
        for(int i=0;i<n;i++){
            if(moves.charAt(i)=='L'){
                cl++;
            }
            else if(moves.charAt(i)=='R'){
                cr++;
            }
            else{
                blank++;
            }
        }
        return Math.abs(cl-cr)+blank;
        //TC->O(N).
        //SC->O(1).
    }
}
