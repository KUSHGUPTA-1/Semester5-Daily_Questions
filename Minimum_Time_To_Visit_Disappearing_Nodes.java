import java.util.*;
public class Minimum_Time_To_Visit_Disappearing_Nodes {
    public static int[] minimumTime(int n, int[][] edges, int[] disappear) {
        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, new HashMap<>());
        }
        // Build graph (keeping minimum edge weight for duplicates)
        for (int[] e : edges) {
            int e1 = e[0];
            int e2 = e[1];
            int cost = e[2];
            map.get(e1).put(e2, Math.min(cost,
                    map.get(e1).getOrDefault(e2, Integer.MAX_VALUE)));
            map.get(e2).put(e1, Math.min(cost,
                    map.get(e2).getOrDefault(e1, Integer.MAX_VALUE)));
        }

        PriorityQueue<Pair> pq =
                new PriorityQueue<>((a, b) -> Integer.compare(a.cost, b.cost));

        HashSet<Integer> visited = new HashSet<>();

        pq.add(new Pair(0, 0));

        int[] arr = new int[n];
        Arrays.fill(arr, -1);
        arr[0] = 0;

        while (!pq.isEmpty()) {

            // 1. Remove
            Pair rp = pq.poll();

            // 2. Ignore
            if (visited.contains(rp.vtx)) {
                continue;
            }

            // 3. Mark visited
            visited.add(rp.vtx);

            // 4. Self work (disappear condition)
            if (rp.cost >= disappear[rp.vtx]) {
                continue;
            }
            arr[rp.vtx] = rp.cost;

            // 5. Add neighbors
            for (int nbr : map.get(rp.vtx).keySet()) {
                if (!visited.contains(nbr)) {
                    pq.add(new Pair(
                            nbr,
                            rp.cost + map.get(rp.vtx).get(nbr)
                    ));
                }
            }
        }
        return arr;
    }

    // ===== MAIN FUNCTION FOR TESTING =====
    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {
                {0, 1, 2},
                {1, 2, 1},
                {0, 2, 4}
        };
        int[] disappear = {1, 3, 5};
        int[] result = minimumTime(n, edges, disappear);
        System.out.println(Arrays.toString(result));
    }
}
// Helper class
class Pair {
    int vtx;
    int cost;

    public Pair(int vtx, int cost) {
        this.vtx = vtx;
        this.cost = cost;
    }
}
