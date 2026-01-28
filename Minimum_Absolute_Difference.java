import java.util.*;
public class Minimum_Absolute_Difference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            int diff=arr[i]-arr[i-1];
            min=Math.min(min,diff);
        }
        List<List<Integer>> l1=new ArrayList<>();
        for(int i=1;i<n;i++){
            if(arr[i]-arr[i-1]==min){
                List<Integer> adj=new ArrayList<>();
                adj.add(arr[i-1]);
                adj.add(arr[i]);
                l1.add(adj);
            }
        }
        return l1;
        //TC->O(N log N).
        //SC->O(N).
    }
}
