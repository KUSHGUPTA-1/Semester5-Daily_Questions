public class Number_Of_1Bits {
    public int hammingWeight(int n) {
        // int count = 0;
        // while (n != 0) {
        //     // Check if the last bit is 1
        //     count += n & 1;
        //     // Right shift the bits of n by 1
        //     n >>>= 1;
        // }
        // return count;
        int c=Integer.bitCount(n);
        return c;
    }
}
