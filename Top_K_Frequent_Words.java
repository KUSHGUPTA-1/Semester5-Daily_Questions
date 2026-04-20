import java.util.*;
class Top_K_Frequent_Words {
    public List<String> topKFrequent(String[] words, int k) {
        ArrayList<String> ans=new ArrayList<>();
        int n=words.length;
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->{
            if(a.f==b.f) return b.s.compareTo(a.s);  //Frequency same toh lower alphabetical order use kro.
            else return a.f-b.f; //Otherwise frequenct ke basis pe ascending order mai sort kr do.
        });
        for(String key:map.keySet()){
            pq.add(new Pair(key,map.get(key)));
            if(pq.size()>k){
                pq.poll();
            }
        }
        for(int i=0;i<k;i++){
            ans.add(pq.poll().s);
        }
        Collections.reverse(ans);
        return ans;
        //TC->O(NlogK) where N is the number of unique words and K is the number of top frequent words we want to return.
        //SC->O(N) for the HashMap and O(K) for the PriorityQueue
    }
}
class Pair{
    String s;
    int f;
    public Pair(String s,int f){
        this.s=s;
        this.f=f;
    }
}