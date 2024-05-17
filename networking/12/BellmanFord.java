import java.util.*;

public class BellmanFord {

    static class Edge {
        char node;
        int weight;

        Edge(char node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    public static Map<Character, Integer> bellmanFord(Map<Character, List<Edge>> graph, char start) {
        Map<Character, Integer> distances = new HashMap<>();
        for (char node : graph.keySet()) {
            distances.put(node, node == start ? 0 : Integer.MAX_VALUE);
        }

        // Relax edges repeatedly
        for (int i = 0; i < graph.size() - 1; i++) {
            for (char node : graph.keySet()) {
                for (Edge neighbor : graph.get(node)) {
                    int distance = distances.get(node) + neighbor.weight;
                    if (distance < distances.get(neighbor.node)) {
                        distances.put(neighbor.node, distance);
                    }
                }
            }
        }

        // Check for negative-weight cycles
        for (char node : graph.keySet()) {
            for (Edge neighbor : graph.get(node)) {
                int distance = distances.get(node) + neighbor.weight;
                if (distance < distances.get(neighbor.node)) {
                    System.out.println("Graph contains a negative-weight cycle");
                    return null;
                }
            }
        }

        return distances;
    }

    public static void main(String[] args) {
        Map<Character, List<Edge>> graph = new HashMap<>();
        graph.put('A', Arrays.asList(new Edge('B', -1), new Edge('C', 4)));
        graph.put('B', Arrays.asList(new Edge('C', 3), new Edge('D', 2), new Edge('E', 2)));
        graph.put('C', Collections.emptyList());
        graph.put('D', Arrays.asList(new Edge('B', 1), new Edge('C', 5)));
        graph.put('E', Collections.singletonList(new Edge('D', -3)));

        char startNode ='A';
        Map<Character, Integer> shortestDistances = bellmanFord(graph, startNode);
        System.out.println("Shortest distances from node " + startNode + ": " + shortestDistances);
    }
}
