public class Count_The_Number_Of_Consistent_Strings {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0;
        for(String s:words){
            boolean match=true;
            for(char ch:s.toCharArray()){
                if(!allowed.contains(String.valueOf(ch))){
                    match=false;
                    break;
                }
            }
            if(match)c++;
        }
        return c;
        //Time Complexity: O(n*m) where n is the length of words and m is the average length of each word.
        //Space Complexity: O(1) as we are using constant space.
    }
}
