public class Minimum_Bit_Flips_To_Convert_Number {
    public int minBitFlips(int start, int goal) {
        return Integer.bitCount(start^goal);
        //TC->O(1).
        //SC->O(1).
    }
}
