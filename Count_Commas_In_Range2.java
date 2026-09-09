public class Count_Commas_In_Range2 {
    public long countCommas(long n) {
        long ans=0;
        long st=1000;
        int com=1;
        while(st<=n){
            long end=Math.min(n,st*1000-1);
            ans+=(end-st+1)*com;
            st*=1000;
            com++;
        }
        return ans;
        //TC->O(log(n))
        //SC->O(1)
    }
}
