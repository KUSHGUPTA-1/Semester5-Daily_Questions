public class Bitwise_And_Of_Numbers_In_Range {
    public int rangeBitwiseAnd(int left, int right) {
        while (right > left) right &= right - 1;
        return right;
        // Time Complexity: O(log(right)).
        // Space Complexity: O(1).
    }
}
