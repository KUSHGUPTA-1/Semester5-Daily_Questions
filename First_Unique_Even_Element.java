import java.util.*;
class First_Unique_Even_Element {
    public int firstUniqueEven(int[] nums) {
        int n=nums.length;
        int freq[]=new int[101];
        for(int num:nums){
            freq[num]++;
        }
        for(int num:nums){
            if(num%2==0 && freq[num]==1){
                return num;
            }
        }
        return -1;
        //TC->O(n).
        //SC->O(1).
    }
    // public int firstUniqueEven(int[] nums) {
    //     Map<Integer, Integer> countMap = new HashMap<>();
    //     for (int num : nums) {
    //         if (num % 2 == 0) {
    //             countMap.put(num, countMap.getOrDefault(num, 0) + 1);
    //         }
    //     }
    //     for (int num : nums) {
    //         if (num % 2 == 0 && countMap.get(num) == 1) {
    //             return num;
    //         }
    //     }
    //     return -1; // Return -1 if no unique even element is found
    //     // TC: O(n)
    //     // SC: O(n)
    // }
}