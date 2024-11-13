import java.util.*;
public class raj{
static int V=5;
void primMST(int graph[][])
{
      int dist[]=new int[V];
      boolean visited[]=new boolean[V];
      int parent[]=new int[V];
      for(int i=0;i<V;i++)
      {
          dist[i]=Integer.MAX_VALUE;
          visited[i]=false;
      }
     
      dist[0]=0;
      parent[0]=-1;
   
      for(int i=0;i<V;i++)
      {
        int u=minDistance(dist,visited);
         visited[u]=true;

         for(int v=0;v<V;v++)
         {
               if(visited[v]==false && graph[u][v]!=0 && graph[u][v]<dist[v])
               {
                parent[v]=u;
                dist[v]=graph[u][v];
               }
         }
      }
      printMST(parent,graph);
}
int minDistance(int dist[],boolean []visited)
{
      int min=Integer.MAX_VALUE;
      int min_index=-1;
      for(int i=0;i<V;i++)
      {
         if(visited[i]==false && dist[i]<min){
              min=dist[i];
              min_index=i;
         } 
      }
      return min_index;
}

void printMST(int parent[],int graph[][])
{
    System.out.println("Edge \tWeight");
      for(int i=1;i<V;i++)
      {
           System.out.println(parent[i]+"-"+i+"\t"+graph[i][parent[i]]);
      }
}
public static void main(String[]args){
    raj t = new raj();
    int graph[][] = new int[][] { { 0, 2, 0, 6, 0 },
                                  { 2, 0, 3, 8, 5 },
                                  { 0, 3, 0, 0, 7 },
                                  { 6, 8, 0, 0, 9 },
                                  { 0, 5, 7, 9, 0 } };

    // Print the solution
    t.primMST(graph);

}
}