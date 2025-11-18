public class One_Bit_Two_Bit_Characters {
    public boolean isOneBitCharacter(int[] bits) {
        final int n=bits.length;
        int i=0;
        while(i<n-1){
            i+=1+bits[i];
        }
        return i==n-1;
        //TC->O(n)
        //SC->O(1)
    }
}
