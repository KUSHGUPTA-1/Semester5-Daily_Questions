import java.util.*;
class The_Watchtower_Horizon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] ans = new int[n];
        int[] stack = new int[n];
        int top = -1;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            while (top >= 0 && a[stack[top]] <= a[i]) {
                top--;
            }
            if (top >= 0) {
                ans[i] = stack[top] - i;
            } else {
                ans[i] = n - 1 - i;
            }
            stack[++top] = i;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        sc.close();
    }
}