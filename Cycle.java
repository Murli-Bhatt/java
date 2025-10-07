import java.util.*;

public class Cycle {

    public static class Edge {
        int src ;
        int dest;
        public Edge(int src,int dest){
            this.src = src;
            this.dest = dest;

        }

    }

   public static void createGraph (ArrayList<Edge> graph[]){
    for(int i=0; i<graph.length; i++){
        graph[i] = new ArrayList<>();

    }
     graph[0].add(new Edge(0,1));
     graph[0].add(new Edge(0,2));

    graph[1].add(new Edge(1,0));
    graph[1].add(new Edge(1,2));

     graph[2].add(new Edge(2,0));
     graph[2].add(new Edge(2,3));
     graph[2].add(new Edge(2,3));


   }

   public static boolean cycleDetection(ArrayList<Edge> graph[] , boolean vis[] , int curr , boolean rec[], int prt){
    vis[curr] = true;
     rec[curr] = true;
     for(int i = 0;i< graph[curr].size();i++){
        Edge e = graph[curr].get(i);
        if(rec[e.dest] == true && e.dest != prt){
            return true;
        }

     if(vis[e.dest] == false){
        if(cycleDetection(graph, vis, e.dest, rec, curr)){
            return true;
        }
     }
     
     }
     rec[curr] = false;

    return false;
   }

   public static void main(String[] args){
    ArrayList<Edge> graph[] = new ArrayList[4];
    boolean vis[] = new boolean[4];
    boolean rec[] = new boolean[4];

    createGraph(graph);
    System.out.println(cycleDetection(graph, vis, 0, rec, -1));
   }
    
}
