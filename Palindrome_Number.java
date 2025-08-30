public class Palindrome_Number {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int m=x;
        int sum=0;
        while(x>0){
            int dig=x%10;
            sum=sum*10+dig;
            x=x/10;
        }
        if(m==sum){
            return true;
        }
        return false;
    }
}
