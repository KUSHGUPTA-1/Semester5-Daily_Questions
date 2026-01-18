
import java.util.*;
public class Vowel_Consonant_Score {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(vowelConsonantScore(s));
    }
    public static int vowelConsonantScore(String s) {
        int cv=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    cv++;
                }
                else{
                    c++;
                }
            }
        }
        if(c==0) return 0;
        return cv/c;
        //TC: O(n)
        //SC: O(1)
    }
}
