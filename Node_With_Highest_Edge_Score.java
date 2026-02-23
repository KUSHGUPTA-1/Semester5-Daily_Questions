public class Node_With_Highest_Edge_Score {
    public int edgeScore(int[] edges) {
        int e=edges.length;
        long arr[]=new long[e]; //Make an array to store the result.
        for(int i=0;i<e;i++){
            arr[edges[i]]=arr[edges[i]]+i;
        }
        //Max-> For the Max Edge score
        long max=0; //Taken in long so that no overflow Exists.
        int idx=0; //To print the final result.
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                idx=i;
            }
        }
        return idx; //Returned the result.
        //TC->O(N).
        //SC->O(N).
    }
}
