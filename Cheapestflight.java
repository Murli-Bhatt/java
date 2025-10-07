import java.util.*;

public class Cheapestflight {

    public static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> flights[]) {
        for (int i = 0; i < flights.length; i++) {
            flights[i] = new ArrayList<>();
        }

        flights[0].add(new Edge(0, 1, 100));
        flights[1].add(new Edge(1, 2, 100));
        flights[2].add(new Edge(2, 0, 100));
        flights[1].add(new Edge(1, 3, 600));
        flights[2].add(new Edge(2, 3, 200));
    }

    public static class Triplet implements Comparable<Triplet>{
        int node;
        int cost;
        int stops;

        public Triplet  (int node, int cost, int stops) {
            this.node = node;
            this.cost = cost;
            this.stops = stops;
       
        }

            @Override
    public int compareTo(Triplet other) {
        return this.cost - other.cost; // Sort by cost ascending
    }

     
    }

    public static int cheapest(ArrayList<Edge> flights[], int src, int trgt, int k) {
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        pq.add(new Triplet(src, 0, 0));

        while (!pq.isEmpty()) {
            Triplet curr = pq.remove();

            if (curr.node == trgt) {
                return curr.cost;
            }

            if (curr.stops > k) continue;

            for (Edge e : flights[curr.node]) {
                pq.add(new Triplet(e.dest, curr.cost + e.wt, curr.stops + 1));
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Edge> flights[] = new ArrayList[4];

        createGraph(flights);
        int result = cheapest(flights, 0, 3, 1);
        System.out.println(result); // Should print 700
    }
}

