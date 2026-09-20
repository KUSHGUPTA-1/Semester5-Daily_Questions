class Counting_Bits{
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        ans[0]=0;
        for(int i=1;i<=n;i++){
            int c=0;
            int num=i;
            while(num!=0){
                if((num&1)==1) c++;
                num>>=1;
            }
            ans[i]=c;
        }
        return ans;
        //TC->O(nlogn).
    }
}