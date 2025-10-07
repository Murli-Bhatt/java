
import java.util.*;

public class Findcycle {

    public static class Edge{
        int src;
        int dest;
        public  Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[] ){

        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
    }
    
}
