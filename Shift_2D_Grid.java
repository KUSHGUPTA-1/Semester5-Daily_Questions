import java.util.*;
class Shift_2D_Grid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        k = k % total; // Normalize k to avoid unnecessary full rotations

        // Create a new grid to hold the shifted values
        int[][] newGrid = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Calculate the new position after shifting
                int newPos = (i * n + j + k) % total;
                int newRow = newPos / n;
                int newCol = newPos % n;
                newGrid[newRow][newCol] = grid[i][j];
            }
        }

        // Convert the 2D array to a list of lists
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(newGrid[i][j]);
            }
            result.add(row);
        }

        return result;
    }
}