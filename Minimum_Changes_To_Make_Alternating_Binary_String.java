class Minimum_Changes_To_Make_Alternating_Binary_String {
    public int minOperations(String s) {
        int n=s.length();
        int c1=0;
        int c2=0;
        for(int i=0;i<n;i++){
            char ch1=i%2==0 ? '1':'0';
            char ch2=i%2==0 ? '0':'1';
            if(s.charAt(i)!=ch1){
                c1++;
            }
            if(s.charAt(i)!=ch2){
                c2++;
            }
        }
        return Math.min(c1,c2);
        //TC->O(N).
        //SC->O(1).
    }
    // public int minOperations(String s) {
    //     int count1 = 0, count2 = 0;
    //     for (int i = 0; i < s.length(); i++) {
    //         if (s.charAt(i) - '0' != i % 2) {
    //             count1++;
    //         } else {
    //             count2++;
    //         }
    //     }
    //     return Math.min(count1, count2);
    // }
}