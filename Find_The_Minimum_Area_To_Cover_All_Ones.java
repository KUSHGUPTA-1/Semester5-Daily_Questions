public class Find_The_Minimum_Area_To_Cover_All_Ones {
    public int minimumArea(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int minr=r,maxr=-1,minc=c,maxc=-1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    minr=Math.min(minr,i);
                    maxr=Math.max(maxr,i);
                    minc=Math.min(minc,j);
                    maxc=Math.max(maxc,j);
                }
            }
        }
        int height=maxr-minr+1;  //length.
        int breadth=maxc-minc+1; //Breadth.
        return height*breadth;  //Area.
        //TC->O(m*n).
        //SC->O(1).
    }
}
