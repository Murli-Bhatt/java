import java.util.*;

public class KosrajuAlgo {

    public static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 4));

    }

    public static void toposort(ArrayList<Edge> graph[], int curr, Stack<Integer> st, boolean vist[]) {
        vist[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vist[e.dest]) {
                toposort(graph, e.dest, st, vist);
            }
        }
        st.push(curr);
    }

    public static void dfs(ArrayList<Edge> transpose[], boolean vist[], int curr) {
        vist[curr] = true;
        System.out.print(curr + " ");

        for (int i = 0; i < transpose[curr].size(); i++) {
            Edge e = transpose[curr].get(i);
            if (!vist[e.dest]) {
                dfs(transpose, vist, e.dest);

            }
         
        }

    }

    public static void kosaRajuAlgo(ArrayList<Edge> graph[], int V) {
        // step 1
        Stack<Integer> st = new Stack<>();

        boolean vist[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if(!vist[i]){
           toposort(graph, i, st, vist);
            }
            
        }

        // step 2 transpose the graph

        ArrayList<Edge> transpose[] = new ArrayList[V];

        for (int i = 0; i < transpose.length; i++) {
            vist[i] = false;
            transpose[i] = new ArrayList<>();
        }

        for (int i = 0; i < V; i++) {

            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);

                transpose[e.dest].add(new Edge(e.dest, e.src));

            }
        }

        // step 3 perform Dfs according to Stack elements 
        while (!st.isEmpty()) {
            int curr = st.pop();
            if (!vist[curr]) {
                dfs(transpose, vist, curr);
                System.out.println(); // Marks the end of one SCC
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[5];
        createGraph(graph);
        kosaRajuAlgo(graph, graph.length);
    }

}
