public class Prime_Number_Of_Set_Bits_In_Binary_Representation {
    public int countPrimeSetBits(int left, int right) {
        int c=0;
        for(int i=left;i<=right;i++){
            int bits=Integer.bitCount(i);
            if(isprime(bits)){
                c++;
            }
        }
        return c;
    }
    public boolean isprime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
        //TC->O(n*logn) where n is the number of integers between left and right. logn is for counting set bits.
        //SC->O(1).
    } 
}
