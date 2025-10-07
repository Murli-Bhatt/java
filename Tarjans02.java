import java.util.*;

public class Tarjans02 {
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
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, int parr, int dt[], int low[], boolean vis[],
            boolean ap[], int time) {
        int child = 0;
        vis[curr] = true;
        dt[curr] = low[curr] = time + 1;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            int neigh = e.dest;
            if (neigh == parr) {
                continue;
            } else if (vis[neigh]) {
                low[curr] = Math.min(low[curr], dt[neigh]);

            } else {

                dfs(graph, neigh, curr, dt, low, vis, ap, time);

                low[neigh] = Math.min(low[curr], low[neigh]);

                if (dt[curr] <= low[neigh] && parr != -1) {
                    ap[curr] = true;
                }
                child++;
            }
        }
        if (parr == -1 && child > 1) {
            ap[curr] = true;
        }

    }

    public static void apPoint(ArrayList<Edge> graph[], int V) {
        int dt[] = new int[V];
        int low[] = new int[V];

        int time = 0;
        boolean vis[] = new boolean[V];
        boolean ap[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, dt, low, vis, ap, time);
            }
        }

        // print articulation point
        for (int i = 0; i < V; i++) {
            if (ap[i]) {
                System.out.println("articulation point :" + i);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[5];

        createGraph(graph);
        apPoint(graph, 5);
    }

}
