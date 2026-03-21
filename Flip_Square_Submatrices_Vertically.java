public class Flip_Square_Submatrices_Vertically {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int top=x;
        int bottom=x+k-1;
        while(top<bottom){
            for(int j=0;j<k;j++){
                int temp=grid[top][y+j];
                grid[top][y+j]=grid[bottom][y+j];
                grid[bottom][y+j]=temp;
            }
            top++;
            bottom--;
        }
        return grid;
        //TC->O(k^2) for flipping the submatrix.
        //SC->O(1) as we are doing in-place flipping.
    }
}
