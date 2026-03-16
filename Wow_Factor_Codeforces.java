import java.util.*;
class Wow_Factor_Codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long c=0;
        long t=0;
        long ans=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)=='v' && s.charAt(i)=='v'){
                t++;
            }
        }
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)=='v' && s.charAt(i)=='v'){
                c++;
            }
            if(s.charAt(i)=='o'){
                ans+=c*(t-c);
            }
        }
        System.out.println(ans);
        //TC->O(n).
        //SC->O(1).
    }
}