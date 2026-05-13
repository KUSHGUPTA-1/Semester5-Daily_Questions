import java.util.*;
public class Add_To_Array_Form_Of_Integer {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> l1 = new ArrayList<>();
        int i = num.length - 1;
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
                i--;
            }
            l1.add(0, k % 10);
            k /= 10;
        }
        return l1;
    }
    public static void main(String[] args) {
        int[] num = {1, 2, 0, 0};
        int k = 34;
        List<Integer> ans = addToArrayForm(num, k);
        System.out.println(ans);
    }
}
