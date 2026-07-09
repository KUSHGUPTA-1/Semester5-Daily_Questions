public class Path_Existence_Queries_In_Graph1 {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        boolean arr[]=new boolean[n];
        arr[0]=true;
        for(int i=1;i<n;i++){
            arr[i]=Math.abs(nums[i]-nums[i-1])<=maxDiff; //Movement tbhi kr ste jb diff<=maxdiff aaye.
        }
        boolean ans[]=new boolean[queries.length];
        for(int q=0;q<queries.length;q++){
            //Query ka start and end index.
            int u=queries[q][0];
            int v=queries[q][1];
            boolean check=true;
            for(int i=Math.min(u,v)+1;i<=Math.max(u,v);i++){ 
                if(!arr[i]){  //If step not allowed then cannot move.
                    check=false;
                    break;
                }
            }
            ans[q]=check; //Store result for this Query.
        }
        return ans;
    }
}
