import java.util.*;

public class pract01 {
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
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

        graph[2].add(new Edge(2, 3));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

    }

    public static void printGraph(ArrayList<Edge> graph[],int vertex) {
        
            for (int j = 0; j < graph[vertex].size(); j++) {
                Edge e = graph[vertex].get(j);
                System.out.print(e.dest);
}
    }
    public static void dfs(ArrayList<Edge> graph[],boolean vis[],int curr){
        System.out.print(curr+" , ");
        vis[curr] = true;
       
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest] == false){
                dfs(graph, vis, e.dest);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[6];
        boolean vis []  = new boolean[6];
        createGraph(graph);
        // printGraph(graph,5);
        for(int i =0;i<6;i++){
          if(vis[i] ==false){
            dfs(graph, vis, i);
          }
        }
    }  

    }


