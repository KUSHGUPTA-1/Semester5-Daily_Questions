public class Smallest_Number_With_All_Set_Bits {
    public int smallestNumber(int n){
        if(Integer.bitCount(n+1)==1)return n; //Checking if no. is 1,3,7,15,31...
        int highest=Integer.highestOneBit(n);
        return (highest*2)-1;
    }
    //TC->O(1)
    //SC->O(1)
}
