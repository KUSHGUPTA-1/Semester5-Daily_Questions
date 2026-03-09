public class Difference_Between_Ones_And_Zeros_In_Row_And_Columns {
    public int[][] onesMinusZeros(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[] onesRow=new int[m];
        int[] onesCol=new int[n];
        // Count ones in rows and columns
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    onesRow[i]++;
                    onesCol[j]++;
                }
            }
        }
        int[][] diff=new int[m][n];
        // Build difference matrix
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++){
                diff[i][j]=2*onesRow[i]+2*onesCol[j]-m-n;
            }
        }
        return diff;
        // Time Complexity: O(m*n) for counting and building the difference matrix
        // Space Complexity: O(m+n) for storing counts of ones in rows and columns,
    }
}
