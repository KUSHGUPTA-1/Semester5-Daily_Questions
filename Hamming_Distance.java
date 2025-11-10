public class Hamming_Distance {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);  // (x^y) bits ko 1 kar dega jha bhi bits different hongi.
        //TC->O(1).
        //SC->O(1).
    }
}
