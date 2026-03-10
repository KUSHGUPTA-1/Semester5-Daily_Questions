import java.util.*;
public class Food_Stamps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();
        long[] v = new long[n];
        long[] d = new long[n];
        for (int i = 0; i < n; i++)
            v[i] = sc.nextLong();
        for (int i = 0; i < n; i++)
            d[i] = sc.nextLong();
        // Implementation for the problem goes here
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Long.compare(b.t, a.t));
        for (int i = 0; i < n; i++) {
            pq.offer(new Pair(v[i], d[i]));
        }  

        long sum = 0;
        while (m>0 && !pq.isEmpty()) {
            Pair rp=pq.poll();
            sum+=rp.t;
            rp.t-=rp.d;
            m--;
            if(rp.t>0) {
                pq.offer(rp);
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
class Pair{
    long t; //taste.
    long d; //decrement of taste.
    public Pair(long t,long d){
        this.t=t;
        this.d=d;
    }
}
