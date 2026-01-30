public class First_Unique_Character_In_A_String {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){  
                return i;
            }
        }
        return -1;
        //TC->O(N).
        //SC->O(1).
    }
}
