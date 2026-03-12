import java.util.*;
class Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(String s:strs){
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
        //TC->O(N*KlogK), where N is the number of strings and K is the maximum length of a string.
        //SC->O(N*K), where N is the number of strings and K is the
    }
}