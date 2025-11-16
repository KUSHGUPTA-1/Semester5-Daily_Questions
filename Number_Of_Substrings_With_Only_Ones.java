public class Number_Of_Substrings_With_Only_Ones {
    public int numSub(String s) {
        long c=0;
        long streak=0;
        long mod=1000000007;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                streak++;
                c+=streak;
            }
            else{
                streak=0;
            }
        }
        return (int)(c%mod);
        //TC->O(n)
        //SC->O(1)
    }
}
