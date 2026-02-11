import java.util.*;
public class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int idx=0;
        while(idx<s1.length() && idx<s2.length()){
            if(s1.charAt(idx)==s2.charAt(idx)){
                idx++;
            } 
            else{
                break;
            }
        }
        return s1.substring(0,idx);
    }
    //TC: O(nlogn) + O(m) where n is the number of strings and m is the length of the longest common prefix.
    //SC: O(1) if we ignore the space used for sorting, otherwise O
}
