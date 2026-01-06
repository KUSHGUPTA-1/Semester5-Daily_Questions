import java.util.*;
public class Longest_Unequal_Adjacent_Group_Subsequence_I {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> result = new ArrayList<>();
        result.add(words[0]);
        for(int i=1;i<words.length;i++){
            if(groups[i]!=groups[i-1]){
                result.add(words[i]);
            }
        }
        return result;
        //TC->O(n)
        //SC->O(n)
    }
}
