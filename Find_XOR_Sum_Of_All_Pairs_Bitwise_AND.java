public class Find_XOR_Sum_Of_All_Pairs_Bitwise_AND {
    public int getXORSum(int[] arr1, int[] arr2) {
        int xor1=0;
        for(int x:arr1){ //Calculated XOR for the first Array.
            xor1^=x;
        }
        int xor2=0;
        for(int y:arr2){ //Calculated XOR for second Array.
            xor2^=y;
        }
        return xor1&xor2; //Returned the and of both the Calculated XOR.
        //TC->O(N+M) where N and M are the sizes of arr1 and arr2 respectively.
        //SC->O(1).
    }
}
