public class Find_The_Pivot_Integer {
    public int pivotInteger(int n) {
        if(n==1){
            return 1;
        }
        int totalsum=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
            if(sum==totalsum-sum+i){
                return i;
            }
        }
        return -1;
        //TC->O(N).
        //SC->O(1).
    }
}
