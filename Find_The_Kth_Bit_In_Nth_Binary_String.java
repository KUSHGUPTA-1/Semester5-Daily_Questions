class Find_The_Kth_Bit_In_Nth_Binary_String {
    public char findKthBit(int n, int k) {
        StringBuilder s=new StringBuilder("0"); //Initially starts with 0.
        for(int i=2;i<=n;i++){ //started from 2 as 1 pe hamesha 1 append hoga.
            StringBuilder inverted=new StringBuilder(); //To store the Inverted string.
            for(int j=0;j<s.length();j++){
                inverted.append(s.charAt(j)=='0'?'1':'0'); //Logic for inversion.
            }
            inverted.reverse(); //Reversed the inverted string.
            s.append("1").append(inverted); //At first position inserted 1 then the reversed inverted string.
        } 
        return s.charAt(k-1); //Returned the kth bit.
        //TC->O(2^N).
        //SC->O(2^N)
    }
}