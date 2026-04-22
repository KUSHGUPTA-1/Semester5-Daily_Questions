import java.util.*;
public class Count_Pairs_Of_Similar_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String words[]=new String[n];
        for(int i=0;i<n;i++){
            words[i]=sc.next();
        }
        System.out.println(similarPairs(words));
        sc.close();
    }
    public static int similarPairs(String[] words) {
        int n=words.length;
        HashMap<HashSet<Character>,Integer> map=new HashMap<>();
        for(String word:words){
            HashSet<Character> set=new HashSet<>();
            for(char ch:word.toCharArray()){
                set.add(ch);
            }
            map.put(set,map.getOrDefault(set,0)+1);
        }
        int ans=0;
        for(int num:map.values()){
            ans+=num*(num-1)/2; // (num words hai toh unke sath num-1 pairs bn skte hai).
        }
        return ans;
        //TC->O(N*L) where N is the number of words and L is the average length of the words.
        //SC->O(N*L) in worst case when all words are unique and have different characters.
    }
}
