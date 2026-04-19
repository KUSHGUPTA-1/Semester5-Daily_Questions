class Maximum_Number_Of_Fish_In_A_Grid {
    public int findMaxFish(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!=0){
                    int count=catchfish(grid,i,j);
                    ans=Math.max(ans,count);
                }
            }
        }
        return ans;
    }
    public int catchfish(int grid[][],int cr,int cc){
        if(cr<0 || cc<0 || cr>=grid.length || cc>=grid[0].length || grid[cr][cc]==0){
            return 0;
        }
        int val=grid[cr][cc];
        grid[cr][cc]=0;
        int c=val;  //Current cell pe jo fish hai uski value adddition.
        c+=catchfish(grid,cr+1,cc);
        c+=catchfish(grid,cr,cc+1);
        c+=catchfish(grid,cr-1,cc);
        c+=catchfish(grid,cr,cc-1);
        return c;
    }
    //TC->O(N*M) where N and M are the dimensions of the grid.
    //SC->O(N*M) in worst case when all cells have fish and we need to visit all of them.
}