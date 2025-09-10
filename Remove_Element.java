public class Remove_Element {
    public int removeElement(int[] nums, int val) {
        int c = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[c]=nums[j];
                c++;
            }
        }
        return c;
    }
}
