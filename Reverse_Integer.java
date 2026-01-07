public class Reverse_Integer {
    public int reverse(int x) {
        long sum=0;
        while(x!=0){
            int r=x%10;
            sum=sum*10+r;
            x=x/10;
        }
        if(sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE){
            return 0;
        }
        return (int)sum;
        //TC->O(log|x|)
        //SC->O(1)
    }
}
