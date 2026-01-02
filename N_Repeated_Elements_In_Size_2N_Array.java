public class N_Repeated_Elements_In_Size_2N_Array {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length/2;
        int freq[]=new int[10001];
        for(int num:nums){
            freq[num]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==n){
                return i;
            }
        }
        return -1;

        //OR
        
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1]){
        //         return nums[i];
        //     }
        // }
        // return -1;
        //TC-> O(N) or O(NlogN)
        //SC-> O(1)
    }
}
