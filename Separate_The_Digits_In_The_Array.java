public class Separate_The_Digits_In_The_Array {
    public int[] separateDigits(int[] nums) {
        StringBuilder sb=new StringBuilder();
        for(int num:nums){
            sb.append(num);
        }
        int result[]=new int[sb.length()];
        for(int i=0;i<sb.length();i++){
            result[i]=sb.charAt(i)-'0';
        }
        return result;
        // Time Complexity: O(n + m), where n is the length of the input array and m is the total number of digits in all the numbers.
        // Space Complexity: O(m), where m is the total number of digits in all the
    }
}
