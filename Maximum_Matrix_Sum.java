public class Maximum_Matrix_Sum {
    public long maxMatrixSum(int[][] matrix) {
        long sum=0;
        int minAbs=Integer.MAX_VALUE;
        int ne=0;
        for(int [] row:matrix){
            for(int x:row){
                minAbs=Math.min(minAbs,Math.abs(x));
                if (x<0){
                    sum-=x;
                    ne=1-ne;
                }
                else sum+=x;
            }
        }
        return sum-2*ne*minAbs;
        //TC->O(m*n)
        //SC->O(1)
    }
}
