class Check_If_Array_Is_Sorted_And_Rotated {
    public boolean check(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
        }
        return count <= 1;
        //TC->O(n).
        //SC->O(1).
    }
}