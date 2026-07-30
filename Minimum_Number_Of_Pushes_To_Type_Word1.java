class Minimum_Number_Of_Pushes_To_Type_Word1 {
    public int minimumPushes(String A) {
        int q = A.length() >> 3;
        int r = A.length() & 7;
        return ((q << 2) + r) * (q + 1);
        //TC->O(1).
        //SC->O(1).
    }
}