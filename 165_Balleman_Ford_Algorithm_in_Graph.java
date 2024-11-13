import java.util.*;
public class raj {
static void  BellmanFord(int graph[][],int V,int E,int source)
{
     int dist[]=new int[V];
     for(int i=0;i<V;i++)
     {
        dist[i]=Integer.MAX_VALUE;
     }
      dist[source]=0;
    for(int i=0;i<V-1;i++)
    {
        //WE are performing operation for weight of Edges//
         for(int j=0;j<E;j++)
         {
            if (dist[graph[j][0]] != Integer.MAX_VALUE && dist[graph[j][0]] + graph[j][2] <
                            dist[graph[j][1]])
                dist[graph[j][1]] = 
                dist[graph[j][0]] + graph[j][2];
         }  
    }

    for(int i=0;i<E;i++)
    {
        int x = graph[i][0];
        int y = graph[i][1];
        int weight = graph[i][2];
        if (dist[x] != Integer.MAX_VALUE &&
                dist[x] + weight < dist[y])
            System.out.println("Graph contains negative"
                    +" weight cycle");
    }
System.out.println("Vertex distance from source: ");
for(int i=0;i<V;i++)
{
    System.out.println(i+"\t "+dist[i]);
}
}
public static void main(String[]args){
    int V = 5; // Number of vertices in graph
    int E = 8; // Number of edges in graph
 
    // Every edge has three values (u, v, w) where
    // the edge is from vertex u to v. And weight  
    // of the edge is w.
    int graph[][]= {{ 0, 1, -1 },
                    { 0, 2, 4 },
                    { 1, 2, 3 },
                    { 1, 3, 2 }, 
                    { 1, 4, 2 }, 
                    { 3, 2, 5 }, 
                    { 3, 1, 1 },
                    { 4, 3, -3 } 
                   };
 
    BellmanFord(graph, V, E, 0);

}
}