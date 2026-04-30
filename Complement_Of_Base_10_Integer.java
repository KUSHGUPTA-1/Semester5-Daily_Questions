import java.util.*;
class Complement_Of_Base_10_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(bitwiseComplement(n));
    }
    public static int bitwiseComplement(int n) {
        if (n == 0) return 1;
        int mask = (1 << (32 - Integer.numberOfLeadingZeros(n))) - 1;
        return n ^ mask;
        //TC-> O(1) since we are doing a constant number of operations
        //SC-> O(1) since we are using a constant amount of space
    }
}