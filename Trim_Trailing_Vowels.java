public class Trim_Trailing_Vowels {
    public String trimTrailingVowels(String s) {
        int n=s.length()-1;
        while(n>=0 && isvowel(s.charAt(n))){
            n--;
        }
        return s.substring(0,n+1);
    }
    public boolean isvowel(char ch){
        ch=Character.toLowerCase(ch);
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ;
    }
    //TC->O(N).
    //SC->O(1).
}
