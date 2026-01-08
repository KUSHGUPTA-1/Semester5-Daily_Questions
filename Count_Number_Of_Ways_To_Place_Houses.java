public class Count_Number_Of_Ways_To_Place_Houses {
    public int countHousePlacements(int n) {
        int mod=1000000007;
        long a=1;
        long b=2;
        for(int i=2;i<=n;i++){
            long c=(a+b)%mod;
            a=b;
            b=c;
        }
        return (int)((b*b)%mod);
        //TC->O(N)
        //SC->O(1)
    }
}
