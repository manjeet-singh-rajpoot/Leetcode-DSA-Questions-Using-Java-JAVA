import java.util.*;

class raj{

    static int time;

    static void addEdge(ArrayList<ArrayList<Integer> > adj, int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void APUtil(ArrayList<ArrayList<Integer> > adj, int u,
                       boolean visited[], int disc[], int low[],
                       int parent, boolean isAP[])
    {
        // Count of children in DFS Tree
        int children = 0;

        // Mark the current node as visited
        visited[u] = true;

        // Initialize discovery time and low value
        disc[u] = low[u] = ++time;

        // Go through all vertices adjacent to this
        for (Integer v : adj.get(u)) {
            // If v is not visited yet, then make it a child of u
            // in DFS tree and recur for it
            if (!visited[v]) {
                children++;
                APUtil(adj, v, visited, disc, low, u, isAP);

                // Check if the subtree rooted with v has
                // a connection to one of the ancestors of u
                low[u] = Math.min(low[u], low[v]);

                // If u is not root and low value of one of
                // its child is more than discovery value of u.
                if (parent != -1 && low[v] >= disc[u])
                    isAP[u] = true;
            }

            // Update low value of u for parent function calls.
            else if (v != parent)
                low[u] = Math.min(low[u], disc[v]);
        }

        // If u is root of DFS tree and has two or more children.
        if (parent == -1 && children > 1)
            isAP[u] = true;
    }

    static void AP(ArrayList<ArrayList<Integer> > adj, int V)
    {
        boolean[] visited = new boolean[V];
        int[] disc = new int[V];
        int[] low = new int[V];
        boolean[] isAP = new boolean[V];
        int time = 0, par = -1;

        // Adding this loop so that the
        // code works even if we are given
        // disconnected graph
        for (int u = 0; u < V; u++)
            if (visited[u] == false)
                APUtil(adj, u, visited, disc, low, par, isAP);

        for (int u = 0; u < V; u++)
            if (isAP[u] == true)
                System.out.print(u + " ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        // Creating second example graph
      int  V = 4;
        ArrayList<ArrayList<Integer> > adj2 = 
                         new ArrayList<ArrayList<Integer> >(V);
        for (int i = 0; i < V; i++)
            adj2.add(new ArrayList<Integer>());

        addEdge(adj2, 0, 1);
        addEdge(adj2, 1, 2);
        addEdge(adj2, 2, 3);

        System.out.println("Articulation points in second graph");
        AP(adj2, V);
    }
}