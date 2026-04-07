package datastructures.treesandgraphs;
import java.util.*;

class Edge {
    int node, weight;

    Edge(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }
}

public class DijkstraShortestPath {
    static void dijkstra(List<List<Edge>> graph, int source) {
        int n = graph.size();
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        PriorityQueue<Edge> pq =
                new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));

        pq.add(new Edge(source, 0));

        while (!pq.isEmpty()) {

            Edge curr = pq.poll();

            for (Edge neighbor : graph.get(curr.node)) {
                int newDist = dist[curr.node] + neighbor.weight;

                if (newDist < dist[neighbor.node]) {
                    dist[neighbor.node] = newDist;
                    pq.add(new Edge(neighbor.node, newDist));
                }
            }
        }

        System.out.println(Arrays.toString(dist));
    }

    public static void main(String[] args) {
        int v = 5;
        List<List<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < v; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(new Edge(1, 4));
        graph.get(0).add(new Edge(2, 1));
        graph.get(2).add(new Edge(1, 2));
        graph.get(1).add(new Edge(3, 1));
        graph.get(2).add(new Edge(3, 5));

        dijkstra(graph, 0);
    }
}