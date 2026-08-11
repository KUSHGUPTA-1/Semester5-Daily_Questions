import java.util.*;
class Emergency_Supply_Convoy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] jobs = new int[n][2];
        for (int i = 0; i < n; i++) {
            jobs[i][0] = sc.nextInt();
            jobs[i][1] = sc.nextInt();
        }
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long sum = 0;
        for (int[] job : jobs) {
            int deadline = job[0];
            int crates = job[1];
            pq.add(crates);
            sum += crates;
            if (pq.size() > deadline)
                sum -= pq.poll();
        }
        System.out.println(sum);
        //TC: O(nlogn) + O(nlogn) = O(nlogn)
        //SC: O(n)
    }
}