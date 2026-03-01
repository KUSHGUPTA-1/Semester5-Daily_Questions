class Partition_Into_Minimum_Number_Of_Deci_Binary_Numbers {
    public int minPartitions(String n) {
        int len=n.length();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            if(max<n.charAt(i)-'0'){
                max=n.charAt(i)-'0';
            }
        }
        return max;
        //TC->O(N).
        //SC->O(1).
    }
    // public int minPartitions(String n) {
    //     int maxDigit = 0;
    //     for (char digit : n.toCharArray()) {
    //         maxDigit = Math.max(maxDigit, digit - '0');
    //     }
    //     return maxDigit;
    // }
}