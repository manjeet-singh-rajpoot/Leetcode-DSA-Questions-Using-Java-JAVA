import java.util.*;

class AdjListNode {
    int v;
    int weight;

    public AdjListNode(int _v, int _w) {
        v = _v;
        weight = _w;
    }

    int getV() {
        return v;
    }

    int getWeight() {
        return weight;
    }
}

class Graph {
    int V;
    List<AdjListNode>[] adj;

    public Graph(int V) {
        this.V = V;
        adj = new List[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    void addEdge(int u, int v, int weight) {
        AdjListNode node = new AdjListNode(v, weight);
        adj[u].add(node);
    }

    void topologicalSortUtil(int v, boolean[] visited, Stack<Integer> stack) {
        visited[v] = true;
        for (AdjListNode node : adj[v]) {
            if (!visited[node.getV()]) {
                topologicalSortUtil(node.getV(), visited, stack);
            }
        }
        stack.push(v);
    }

    void shortestPath(int s) {
        Stack<Integer> stack = new Stack<>();
        int[] dist = new int[V];
        boolean[] visited = new boolean[V];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[s] = 0;

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topologicalSortUtil(i, visited, stack);
            }
        }

        while (!stack.isEmpty()) {
            int u = stack.pop();
            for (AdjListNode node : adj[u]) {
                int v = node.getV();
                int weight = node.getWeight();
                if (dist[v] > dist[u] + weight) {
                    dist[v] = dist[u] + weight;
                }
            }
        }

        // Print the shortest distances from the source vertex
        for (int i = 0; i < V; i++) {
            System.out.println("Short dist from source to vertex " + i + ": " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int V = 6; // Number of vertices
        Graph graph = new Graph(V);
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 3, 4);
        graph.addEdge(2, 3, 1);
        graph.addEdge(3, 4, 5);
        graph.addEdge(4, 5, 2);

        int sourceVertex = 0; // Source vertex
        graph.shortestPath(sourceVertex);
    }
}