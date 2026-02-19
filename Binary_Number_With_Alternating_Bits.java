public class Binary_Number_With_Alternating_Bits {
    public boolean hasAlternatingBits(int n) {
        // n>>1 = shift all bits to right by one.
        //When xor with n then all bits become one.
        // (x&(x+1))==0 means x is 2^k - 1 (all 1s)
        int x=n^(n>>1);
        return (x&(x+1))==0;
        //TC->O(1).
        //SC->O(1).
    }
}
