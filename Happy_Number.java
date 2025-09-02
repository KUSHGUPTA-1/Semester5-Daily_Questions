public class Happy_Number {
    public boolean isHappy(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        if(sum==1){
            return true;
        }
        return false;
    }
}
