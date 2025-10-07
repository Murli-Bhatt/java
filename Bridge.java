// bridge is an Edge in a graph whose deletion increases the graph's number of connected componenets
import java.util.*;

public class Bridge {
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

    public static void dfs(ArrayList<Edge> graph[], int dt[], int lowdt[], boolean vist[], int curr, int prnt,
            int time) {
        vist[curr] = true;
        
        dt[curr] = lowdt[curr] = ++time;
        //checking all neighbours of current node
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (e.dest == prnt)
            {
                continue;
            }  //update the lowdt of current node if  destination node is already visited 
            if (vist[e.dest]) {

                lowdt[curr] = Math.min(lowdt[curr], dt[e.dest]);
            } else {
                dfs(graph, dt, lowdt, vist, e.dest, curr, time);
                lowdt[curr] = Math.min(lowdt[curr], lowdt[e.dest]);
                if (dt[curr] < lowdt[e.dest]) {
                    
                    System.out.println("BRIDGE : " + curr + "---" + e.dest);
                }

            }
        }
    }

    public static void tarjanAlgo(ArrayList<Edge> graph[], int V) {
        //here we are using two arrays one is dt (discovery time) it stored the time when the node was first visited and another one is lowdt (lowest discovery
        //it  is earliest discovery time of any node reachable from that  node,
        int dt[] = new int[V];
        int lowdt[] = new int[V];

        boolean vist[] = new boolean[V];
        int time = 0; 
        for (int i = 0; i < V; i++) {
            if (!vist[i]) {
                //here we call the helping function 
                dfs(graph, dt, lowdt, vist, i, -1, time);
            }

            
        }

    }

    public static void main(String[] args){
        int V =5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        tarjanAlgo(graph, V);

        
    }

}
