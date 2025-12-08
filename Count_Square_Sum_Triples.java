public class Count_Square_Sum_Triples {
    public int countTriples(int n) {
        int count = 0;
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                int c2 = a * a + b * b;   // a² + b²
                int c = (int)Math.sqrt(c2);
                if (c <= n && c * c == c2) {   // check perfect square
                    count++;
                }
            }
        }
        return count;
        //time complexity is O(n^2)
        //space complexity is O(1)
    }
}
