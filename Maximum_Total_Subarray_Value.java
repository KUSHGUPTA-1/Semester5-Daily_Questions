class Maximum_Total_Subarray_Value {
    public int maxTotalSubarrayValue(int[] nums) {
        int n = nums.length;
        int maxValue = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < n; i++) {
            currentSum += nums[i];
            maxValue = Math.max(maxValue, currentSum);
            if (currentSum < 0) {
                currentSum = 0; // Reset the sum if it becomes negative
            }
        }

        return maxValue;
        //TC: O(n) where n is the length of the input array
        //SC: O(1) since we are using only a constant amount of extra space
    }
}