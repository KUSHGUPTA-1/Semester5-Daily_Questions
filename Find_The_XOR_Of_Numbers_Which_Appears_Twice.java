public class Find_The_XOR_Of_Numbers_Which_Appears_Twice {
    public int duplicateNumbersXOR(int[] nums) {
        int n=nums.length;
        int xor=0;
        int freq[]=new int[51];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
            if(freq[nums[i]]==2){
                xor^=nums[i];
            }
        }
        return xor;
        //TC->O(N).
        //SC->O(N).
    }
}
