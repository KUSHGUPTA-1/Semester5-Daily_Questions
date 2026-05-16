import java.util.*;
class Find_Minimum_In_Rotated_Sorted_Array2{
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1; // Minimum is in the right half
            } else if (nums[mid] < nums[high]) {
                high = mid; // Minimum is in the left half or at mid
            } else {
                high--; // When nums[mid] and nums[high] are equal, we can safely ignore the last element
            }
        }
        return nums[low]; // At the end of the loop, low will point to the minimum element
        // Time Complexity: O(log n) in the average case, but can degrade to O(n) in the worst case due to duplicates.
        // Space Complexity: O(1) as we are using constant extra space.
    }
}