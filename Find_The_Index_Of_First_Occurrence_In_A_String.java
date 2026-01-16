public class Find_The_Index_Of_First_Occurrence_In_A_String {
    public int strStr(String haystack, String needle) {
        //Optimal O(M*N)
        // if(needle.length()==0) return 0;
        // else{
        //     return haystack.indexOf(needle);
        // }
        
        //Optimal using O(N) for Average case.
        int n=haystack.length();
        int m=needle.length();
        if(needle.length()==0) return 0;
        for(int i=0;i<=n-m;i++){
            if(haystack.substring(i,i+m).equals(needle)){
                return i;
            }
        }
        return -1;
        //TC->O(N*M) in worst case.
        //SC->O(1).
    }
}
