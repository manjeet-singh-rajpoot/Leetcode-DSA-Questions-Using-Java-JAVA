import java.util.*;
public class raj{
static int V=4;
boolean graphColoring(int graph[][],int m)
{
      int color[]=new int[V];
      for(int i=0;i<V;i++)
      {
         color[i]=0;
      }
      
      if(graphutil(graph,color,m,0)==false)
      {
            System.out.print("Solution does not exists");
            return false;
      }

      printsolution(color);
      return true;
}
static boolean graphutil(int graph[][],int color[],int m,int v)
{
      if(v==V)
      {
        return true;
      }

      for(int c=1;c<=m;c++)
      {
           if(issafe(v,graph,color,c))
           {
                 color[v]=c;
            if(graphutil(graph, color, m, v+1)==true)
            {
                return true;
            }

            color[v]=0;
         }
      }

      return false;
}  
static boolean issafe(int v,int graph[][],int color[],int c)
{
        for(int i=0;i<V;i++)
        {
            if(graph[v][i]==1 && c==color[i]){
                return false;
            }
          
        }
        return true;
}
static void printsolution(int color[])
{
       for(int i=0;i<V;i++)
       {
        System.out.print(" "+color[i]+" ");
       }
}
public static void main(String[]args){
    int graph[][] = {
        { 0, 1, 1, 1 },
        { 1, 0, 1, 0 },
        { 1, 1, 0, 1 },
        { 1, 0, 1, 0 },
    };
    int m = 3; // Number of colors
    raj r=new raj();
    // Function call
    r.graphColoring(graph, m);

}
}