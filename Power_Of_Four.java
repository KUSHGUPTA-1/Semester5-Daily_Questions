public class Power_Of_Four {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        while (n > 1) {
            if (n % 4 != 0) {
                return false;
            }
            n /= 4;
        }
        return true;
        // OR
        // else if(n==1){
        //     return true;
        // }
        // else{
        //     return n%4==0 && isPowerOfFour(n/4);
        // }
    }
}
