import java.util.*;
public class raj{
static int V=9;
void dijkstra(int graph[][],int source)
{
    boolean visited[]=new boolean[V];
    int dist[]=new int[V];
    
    for(int i=0;i<V;i++)
    {
         dist[i]=Integer.MAX_VALUE;
         visited[i]=false;
    }
   
    dist[source]=0;

    for(int i=0;i<V;i++)
    {
          int u=minDistance(dist,visited);
          visited[u]=true;

          //Now For adjecency List//
          //v works gor adjcency index//
          //u works for minmum distance//
          for(int v=0;v<V;v++)
          {
              if(!visited[v] && graph[u][v]!=0 && 
              (dist[u]!=Integer.MAX_VALUE) &&
               (dist[u]+graph[u][v]< dist[v]))
              {
                    dist[v]=dist[u]+graph[u][v];
              }
          }
    }

    printsolution(dist,V);
}
int  minDistance(int dist[],boolean []visited)
{
      int min=Integer.MAX_VALUE;
      int min_index=-1;
      for(int i=0;i<V;i++)
      {
            if(visited[i]==false && dist[i]<=min)
            {
                 min=dist[i];
                 min_index=i;
            }
      }
      return min_index;
}
void printsolution(int []dist,int n)
{
    System.out.println("Shortest distnce from sourct to vertex: ");
      for(int i=0;i<V;i++)
      {
          System.out.println(i+ " tt " +dist[i]); 
      }
}

public static void main(String[]args){
    int graph[][] = new int[][] {
    { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
    { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
    { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
    { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
    { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
    { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
    { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
    { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
    { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
raj t = new raj();
t.dijkstra(graph, 0);

}
}