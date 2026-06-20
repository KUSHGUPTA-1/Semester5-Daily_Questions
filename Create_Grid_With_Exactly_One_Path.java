public class Create_Grid_With_Exactly_One_Path {
    public String[] createGrid(int m, int n) {
        String ans[]=new String[m];
        for(int i=0;i<m;i++){
            char row[]=new char[n];
            for(int j=0;j<n;j++){
                row[j]='#';
            }
            if(i==0){
                for(int j=0;j<n;j++){
                    row[j]='.';
                }
            }
            else{
                row[n-1]='.';
            }
            ans[i]=new String(row);
        }
        return ans;
        // Time Complexity: O(m*n), where m is the number of rows and n is the number of columns. We iterate through each cell of the grid to fill it with the appropriate characters.
        // Space Complexity: O(m*n), as we are creating a grid of size m x
    }
}
