import java.util.*;
class Network_Delay_Time {
    public int networkDelayTime(int[][] times, int n, int k) {
        HashMap<Integer,HashMap<Integer,Integer>> graph = new HashMap<>();
        for(int i=1;i<=n;i++){
            graph.put(i,new HashMap<>());
        }
        for(int[] t:times){
            graph.get(t[0]).put(t[1],t[2]);
        }
        int ans=-1; //Minimum value taken.
        PriorityQueue<Pair> pq =new PriorityQueue<>((a,b)->a.cost-b.cost);
        HashSet<Integer> visited = new HashSet<>();
        pq.add(new Pair(k,0));
        while (!pq.isEmpty()) {
            // 1. REMOVE
            Pair rp=pq.poll();
            int v=rp.vtx;
            int c=rp.cost;
            // 2. IGNORE
            if(visited.contains(v)) continue;
            // 3. MARK VISITED
            visited.add(v);
            // 4. SELF WORK
            ans=Math.max(ans,c);  //max isliye liya taki pta chl jaye kyoki max time mai mera signal har node ko visit kr lega.
            // 5. ADD UNVISITED NEIGHBOURS
            for(int nbrs:graph.get(v).keySet()){
                if(!visited.contains(nbrs)){
                    int newcost=c+graph.get(v).get(nbrs);
                    pq.add(new Pair(nbrs,newcost));
                }
            }
        }
        if(visited.size()!=n){
            return -1;
        }
        else{
            return ans;
        }
        //TC->O(ElogV).
        //SC->O(V+E).
    }
}
class Pair{
    int vtx;
    int cost;
    public Pair(int vtx,int cost){
        this.vtx=vtx;
        this.cost=cost;
    }
}
