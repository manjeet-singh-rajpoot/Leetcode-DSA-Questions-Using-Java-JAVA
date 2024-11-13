class Graph {
    private int V;   // No. of vertices
    private int[][] adj; // Adjacency List

    //Constructor
    Graph(int v) {
        V = v;
        adj = new int[V][V];
    }

    //Function to add an edge into the graph
    void addEdge(int v, int w)
     { 
        adj[v][w] = 1;
     }

    // A recursive function to print DFS starting from v
    void DFSUtil(int v, boolean visited[]) {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");

        // Recur for all the vertices adjacent to this vertex
        for (int i = 0; i < V; i++) {
            if(adj[v][i] == 1 && !visited[i]) {
                DFSUtil(i, visited);
            }
        }
    }

    // Function that returns reverse (or transpose) of this graph
    Graph getTranspose() {
        Graph g = new Graph(V);
        for (int v = 0; v < V; v++) {
            // Recur for all the vertices adjacent to this vertex
            for (int i = 0; i < V; i++) {
                if(adj[v][i] == 1)
                    g.adj[i][v] = 1;
            }
        }
        return g;
    }

    void fillOrder(int v, boolean visited[], int stack[]) {
        // Mark the current node as visited and print it
        visited[v] = true;

        // Recur for all the vertices adjacent to this vertex
        for (int i = 0; i < V; i++) {
            if(adj[v][i] == 1 && !visited[i]) {
                fillOrder(i, visited, stack);
            }
        }

        // All vertices reachable from v are processed by now,
        // push v to Stack
        for (int i = 0; i < V; i++) {
            if(stack[i] == -1) {
                stack[i] = v;
                break;
            }
        }
    }

    // The main function that finds and prints all strongly
    // connected components
    void printSCCs() {
        boolean[] visited = new boolean[V];
        int[] stack = new int[V];
        
        // Fill vertices in stack according to their finishing times
        for(int i = 0; i < V; i++)
            stack[i] = -1;

        for(int i = 0; i < V; i++)
            if(!visited[i])
                fillOrder(i, visited, stack);

        // Create a reversed graph
        Graph gr = getTranspose();

        // Mark all the vertices as not visited (For second DFS)
        for(int i = 0; i < V; i++)
            visited[i] = false;

        // Now process all vertices in order defined by Stack
        while(containsUnvisited(stack)) {
            int v = getNextUnvisited(stack);
            if(!visited[v]) {
                gr.DFSUtil(v, visited);
                System.out.println();
            }
        }
    }

    boolean containsUnvisited(int stack[]) {
        for(int i : stack)
            if(i != -1)
                return true;
        
        return false;
    }

    int getNextUnvisited(int stack[]) {
        for(int i = stack.length - 1; i >= 0; i--) {
            if(stack[i] != -1) {
                int val = stack[i];
                stack[i] = -1;
                return val;
            }
        }
        
        return -1;
    }
}

// Driver method
public class Main {
    public static void main(String args[]) {
        
        // Create a graph given in the above diagram
        Graph g = new Graph(5);
        
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(3, 4);

        
        System.out.println("Following are strongly connected components "+
                           "in given graph ");
        g.printSCCs();
    }
}