import java.util.*;

public class Prims {
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

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();

        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));
        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));

    }

    public static class Pair implements Comparable<Pair> {
        int v;
        int cost;

        public Pair(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static void primsAlgo(ArrayList<Edge> graph[]) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean vist[] = new boolean[graph.length];
        int mincost = 0;
        ArrayList<Edge> ans[] = new ArrayList[graph.length];
        for(int i =0; i<ans.length;i++){
            ans[i] =new ArrayList<>();
        }
         int j =0;
        pq.add(new Pair(0,0));
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();

     
            if (!vist[curr.v]) {
                vist[curr.v] = true;
                 ans[j].add(new Edge(j, curr.v,curr.cost));

                mincost += curr.cost;
                for (int i = 0; i < graph[curr.v].size(); i++) {
                    Edge e = graph[curr.v].get(i);
                    if (!vist[e.dest]) {
                        pq.add(new Pair(e.dest, e.wt));
                        
                    }

                }
                
            }
            j +=1;
        }
        System.out.println(mincost);
        
        for(int i = 0 ; i<ans.length ; i++){
       
            for(Edge e : ans[i]){
                System.out.print(e.src+" "+e.dest +" ");
            }
             System.err.println();
        }
       
    }

    public static void main(String[] args){
        ArrayList<Edge> graph[] = new ArrayList[4];
        createGraph(graph);
        primsAlgo(graph);
    }
}
