class Find_Minimum_In_Rotated_Sorted_Array {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1; // Minimum is in the right half
            } else {
                high = mid; // Minimum is in the left half or at mid
            }
        }
        return nums[low]; // At the end of the loop, low will point to the minimum element
        // Time Complexity: O(log n) due to binary search.
        // Space Complexity: O(1) as we are using constant extra space.
    }
}