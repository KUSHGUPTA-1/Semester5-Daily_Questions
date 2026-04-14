import java.util.*;
class Minimum_Distance_To_The_Target_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5]; // Example input: [1, 2, 3, 4, 5]
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt(); //3
        int start = sc.nextInt(); //1
        System.out.println(getMinDistance(nums, target, start)); // Output: 2
        sc.close();
    }
    public static int getMinDistance(int[] nums, int target, int start) {
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                minDistance = Math.min(minDistance, Math.abs(i - start));
            }
        }
        return minDistance;
        //TC->O(N).
        //SC->O(1).
    }
}