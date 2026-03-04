public class Special_Position_In_Binary_Matrix {
    public int numSpecial(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int rowc[]=new int[n]; //To check how many ones in each row.
        int colc[]=new int[m]; //To check how many ones in each col.
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){ //Agar value 1 hai toh increment kr do.
                    rowc[i]++;
                    colc[j]++;
                }
            }
        }
        int ans=0; //To determine special positions.
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                //Jaha mai hu vaha value 1 hai and us puri and col mai bhi 1 hi 1 one hai.
                if(mat[i][j]==1 && rowc[i]==1 && colc[j]==1){ 
                    ans++; //Increment the ans variable.
                }
            }
        }
        return ans; //Return the Output.
        //TC->O(M*N).
        //SC->O(M+N).
    }
}
