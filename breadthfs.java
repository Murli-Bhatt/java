import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class breadthfs {
  static class Edge {
    int src;
    int dest;

    public Edge(int s, int d) {
      this.src = s;
      this.dest = d;
    }

  }

  public static void createGraph(ArrayList<Edge> graph[]) {
    for (int i = 0; i < graph.length; i++) {
      graph[i] = new ArrayList<Edge>();
    }

    graph[0].add(new Edge(0, 1));
    graph[0].add(new Edge(0, 2));

    graph[1].add(new Edge(1, 0));
    graph[1].add(new Edge(1, 2));
    graph[1].add(new Edge(1, 4));

    graph[2].add(new Edge(2, 0));
    graph[2].add(new Edge(2, 1));
    graph[2].add(new Edge(2, 3));

    graph[3].add(new Edge(3, 2));

    graph[4].add(new Edge(4, 1));
    graph[4].add(new Edge(4, 5));

    graph[5].add(new Edge(5, 4));

  }

  public static void bfs(ArrayList<Edge> graph[], int v) {
    Queue<Integer> q = new LinkedList<>();
    boolean vis[] = new boolean[v];
    q.add(0);

    while (!q.isEmpty()) {
      int curr = q.remove();
      if (vis[curr] == false) {
        System.out.print(curr + ",");
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
          Edge e = graph[curr].get(i);
          q.add(e.dest);
        }

      }
    }
  }

  public static void main(String args[]) {
    int v = 6;
    ArrayList<Edge> graph[] = new ArrayList[v];
    createGraph(graph);
    bfs(graph, v);
    System.out.println();

  }

}
