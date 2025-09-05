public class Min_Operations_To_Make_Integer_Zero {
    public int makeTheIntegerZero(int num1, int num2) {
        for (int k = 1; k < 61; k++) {
            long diff = (long)num1 - (long)k * num2;
            if (diff < 0) break;
            int bitCount = Long.bitCount(diff);
            if (bitCount <= k && k <= diff) {
                return k;
            }
        }
        return -1;
    }
}
