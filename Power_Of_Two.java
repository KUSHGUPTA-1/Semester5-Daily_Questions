class Solution {
    public boolean isPowerOfTwo(int n) {
        for(long i=0;i<n;i++){
            long a=(long)Math.pow(2,i); 
            if(a==n){
                return true;
            }
            if(a>n){
                return false;
            }
        }
        return false;
    }
}