package datastructures.treesandgraphs;
import java.util.*;

public class DetectCycleUndirected {
    static boolean dfs(List<List<Integer>> graph, int node, boolean[] visited, int parent) {
        visited[node] = true;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(graph, neighbor, visited, node))
                    return true;
            }
            else if (neighbor != parent)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int v = 3;
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < v; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(1).add(0);
        graph.get(1).add(2);
        graph.get(2).add(1);
        graph.get(2).add(0);
        graph.get(0).add(2);

        System.out.println("Cycle: " + dfs(graph, 0, new boolean[v], -1));
    }
}