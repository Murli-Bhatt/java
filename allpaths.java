//time complexity of this code is O(V^V).
import java.util.ArrayList;

public class allpaths {
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }

    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]= new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));

    }
    public static void printAllPath(ArrayList<Edge>graph[],int curr,boolean vis[],String path,int target){
       
        if(curr == target){
            System.out.println(path);
            return;

        }

        for(int i=0; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

               if(vis[curr]==false){
                vis[curr]=true;
                printAllPath(graph,e.dest,vis,path +e.dest,target);
                vis[curr]=false;
               }
        }
    }
    public static void main(String args[]){
     int v =7;
     ArrayList<Edge> graph[]= new ArrayList[v] ;
     createGraph(graph);
     String path = "0";
     boolean vis[]= new boolean[v];
     printAllPath(graph, 0,vis, path, 5);
    }
    
}
