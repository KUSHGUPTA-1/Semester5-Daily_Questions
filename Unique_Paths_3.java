import java.util.*;
public class Unique_Paths_3 {
    static int totalempty=0;
    static int paths=0;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt(); 
        int grid[][]=new int[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        int m=grid.length;
        int n=grid[0].length;
        int sx=0;
        int sy=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=-1) totalempty++;  //Total walkable paths.
                if(grid[i][j]==1){
                    sx=i;
                    sy=j;
                }
            }
        }
        dfs(grid,sx,sy,1);   //Starting cell already visited.
        System.out.println(paths);
    }
    public static void dfs(int grid[][],int i,int j,int count){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==-1){
            return;
        }
        if(grid[i][j]==2){
            if(count==totalempty){
                paths++;
            }
            return;
        }
        int temp=grid[i][j];
        grid[i][j]=-1;   //Mark all as visited.
        dfs(grid,i+1,j,count+1);  //down
        dfs(grid,i-1,j,count+1);  //up
        dfs(grid,i,j+1,count+1);  //right
        dfs(grid,i,j-1,count+1);  //left
        grid[i][j]=temp;
    }
}
