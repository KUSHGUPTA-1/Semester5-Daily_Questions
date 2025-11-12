public class Elimination_Game {
    public int lastRemaining(int n) {
        // int start=1;
        // int gap=1;
        // boolean dir=true;
        // while(n>1){
        //     if(n%2==1){
        //         start+=gap;
        //     }
        //     n/=2;
        //     gap*=2;
        //     dir=!dir;
        // }
        // return start;
        int result;
        if(n==1){
            return 1;
        }
        else{
            int temp=lastRemaining(n/2);
            result=2*(1+n/2-temp);
        }
        return result;
    }
}
