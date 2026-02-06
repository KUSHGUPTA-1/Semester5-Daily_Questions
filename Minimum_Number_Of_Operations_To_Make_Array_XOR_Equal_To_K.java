public class Minimum_Number_Of_Operations_To_Make_Array_XOR_Equal_To_K {
    public int minOperations(int[] nums, int k) {
        for(int num:nums){
            k^=num; //Find the XOR of all the elements in the Array.
        }
        return Integer.bitCount(k); //Count the total no of ones in the final xor to get the no.of operations.
        //TC->O(log N).
        //SC->O(1).
    }
}
