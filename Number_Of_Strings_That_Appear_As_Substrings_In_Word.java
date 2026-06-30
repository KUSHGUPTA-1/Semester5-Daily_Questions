public class Number_Of_Strings_That_Appear_As_Substrings_In_Word {
    public int numOfStrings(String[] patterns, String word) {
        int c=0;
        for(String s:patterns){
            if(word.contains(s)){
                c++;
            }
        }
        return c;
        //TC->O(N*M), where N is the number of patterns and M is the average length of the patterns. 
        // For each pattern, we check if it is a substring of the word, which takes O(M) time.
        //SC->O(1), as we are using a constant amount of extra space for the counter variable c.
    }
}
