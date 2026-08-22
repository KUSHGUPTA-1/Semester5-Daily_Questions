public class Check_Divisibility_By_Digit_Sum_And_Product {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int pro=1;
        int b=n;
        while(b!=0){
            int r=b%10;
            sum+=r;
            pro*=r;
            b/=10;
        }
        return n%(sum+pro)==0;
        //TC->O(N).
        //Sc->O(1).
    }
}
