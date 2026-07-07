public class Concatenate_Non_Zero_Digits_And_Multiply_By_Sum1{
    public long sumAndMultiply(int n) {
        String s=Integer.toString(n);
        long x=0L;
        long sum=0L;
        for(char ch:s.toCharArray()){
            if(ch!='0'){
                int digit=ch-'0';
                x=x*10+digit;
                sum+=digit;
            }
        }
        return x*sum;
        //TC->O(d) where d is the number of digits in n.
        //SC->O(d) because Integer.toString(n) creates a string of d characters.
    }
}
