public class Delete_Columns_To_Make_Sorted {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        for (int col = 0; col < strs[0].length(); col++) {
            for (int row = 1; row < strs.length; row++) {
                if (strs[row].charAt(col) < strs[row - 1].charAt(col)) {
                    count++;
                    break;
                }
            }
        }
        return count;
        // Time Complexity: O(m * n) where m is number of strings and n is length of each string
        // Space Complexity: O(1)
    }
}
