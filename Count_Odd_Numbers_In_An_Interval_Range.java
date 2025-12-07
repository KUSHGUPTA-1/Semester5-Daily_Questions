public class Count_Odd_Numbers_In_An_Interval_Range {
    public int countOdds(int low, int high) {
        // int c=0;
        // for(int i=low;i<=high;i++){
        //     if(i%2!=0){
        //         c++;
        //     }
        // }
        // return c;
        int a=low%2!=0 || high%2!=0 ? 1:0;
        return (high-low)/2+a;
        //time complexity is O(1)
        //space complexity is O(1)
    }
}
