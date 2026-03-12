class Narcissistic_Number {
    static int isNarcissistic(int N) {
        // code her
        int c=0;
        int a=N;
        while(a!=0){
            a/=10;
            c++;
        }
        a=N;
        int sum=0;
        while(a!=0){
            int r=a%10;
            sum+=Math.pow(r,c);
            a/=10;
        }
        if(sum==N)
            return 1;
        else
            return 0;
        //TC->O(logN).
        //SC->O(1).
    }
}