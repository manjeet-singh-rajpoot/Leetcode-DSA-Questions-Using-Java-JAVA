import java.util.*;
public class  raj{
static int INF=99999;
static int V=4;
void floyedwarshal(int graph[][])
{
       
   for(int k=0;k<V;k++)
   {
      for(int i=0;i<V;i++)
      {
         for(int j=0;j<V;j++)
         {
              if(graph[i][j]>graph[i][k]+graph[k][j])
              {
                 graph[i][j]=graph[i][k]+graph[k][j];
              }
         }
      }
   }
   printsolution(graph);
}

static void printsolution(int graph[][]){
   for(int i=0;i<V;i++)
   {
      for(int j=0;j<V;j++)
      {
           if(graph[i][j]==INF)
           {
              System.out.print("INF"+" ");
           }else{
            System.out.print(graph[i][j]+" ");
           }
      }
      System.err.println();
   }
}
public static void main(String[]args){
   int graph[][] = { { 0, 5, INF, 10 },
   { INF, 0, 3, INF },
   { INF, INF, 0, 1 },
   { INF, INF, INF, 0 } };

   raj r=new raj();

   r.floyedwarshal(graph);

}
}