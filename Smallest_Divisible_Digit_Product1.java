public class Smallest_Divisible_Digit_Product1 {
    public int smallestNumber(int n, int t) {
        while(true){
            if(Product(n)%t==0){
                return n;
            }
            n++;
        }
    }
    public int Product(int n){
        int product=1;
        while(n!=0){
            int r=n%10;
            product*=r;
            n=n/10;
        }
        return product;
    }
    //TC->O(log n).
    //SC->O(1).
}
