class Find_Unique_Binary_String {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char bit = nums[i].charAt(i) == '0' ? '1' : '0';
            sb.append(bit);
        }
        return sb.toString();
    }
    // public String findDifferentBinaryString(String[] nums) {
    //     int n=nums.length;
    //     Set<Integer> set=new HashSet<>();
    //     for(String s:nums){
    //         set.add(Integer.parseInt(s,2));
    //     }
    //     for(int i=0;i<(1<<n);i++){
    //         if(!set.contains(i)){
    //             String s1=Integer.toBinaryString(i);
    //             while(s1.length()<n){
    //                 s1="0"+s1;
    //             }
    //             return s1;
    //         }
    //     }
    //     return "";
    // }
}