import java.util.*;
public class Jump_Game3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7]; //arr[]={4,2,3,0,3,1,2}
        for(int i=0;i<7;i++){
            arr[i]=sc.nextInt();
        }
        int start=sc.nextInt(); //start=5
        System.out.println(canReach(arr,start));
    }
    public static boolean canReach(int[] arr, int start) {
        boolean visited[]=new boolean[arr.length];
        return dfs(arr,start,visited);
    }
    public static boolean dfs(int arr[],int i,boolean visited[]){
        if(i<0 || i>=arr.length || visited[i]){
            return false;
        }
        if(arr[i]==0){
            return true;
        }
        visited[i]=true;
        return dfs(arr,i+arr[i],visited) || dfs(arr,i-arr[i],visited);
    }
    // Time Complexity: O(n) in the worst case, where n is the length of the array. This happens when we visit each element at most once.
    // Space Complexity: O(n) in the worst case due to the visited array and the

}
