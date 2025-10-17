public class Unique_Path_2 {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        if(grid[0][0]==1){  //starting cell has obstacle hence no path.
            return 0;
        }
        for(int i=0;i<m;i++){  //Fill First Entire column to 1.
            if(grid[i][0]==1)break;
            dp[i][0]=1;
        }
        for(int j=0;j<n;j++){  //Fill First Entire row to 1.
            if(grid[0][j]==1)break;
            dp[0][j]=1;
        }
        //Now fill rest of dp Table.
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(grid[i][j]==1){ 
                    dp[i][j]=0;
                }
                else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
