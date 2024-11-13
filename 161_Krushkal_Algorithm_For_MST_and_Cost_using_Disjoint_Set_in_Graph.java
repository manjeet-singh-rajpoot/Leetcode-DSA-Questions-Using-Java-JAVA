import java.util.*;
public class raj{
    static int V=5;
   static int parent[]=new int[V];
  static  int rank[]=new int[V];
  static int INF=Integer.MAX_VALUE;
           //Disjoint Set open//

static int findparent(int i)

    {
        while (parent[i] != i)
            i = parent[i];
        return i;
    }

static void union(int u,int v)
{
     u=findparent(u);
     v=findparent(v);

     if(rank[u]<rank[v])
     {
         parent[u]=v;
     }else if(rank[v]<rank[u])
     {
         parent[v]=u;
     }else{
        parent[v]=u;
        rank[u]++;
     }
}
       //Disjoint Set oF//

static void krushkalMST(int cost[][])
{
       int mincost=0;
    for(int i=0;i<V;i++)
    {
        parent[i]=i;
        rank[i]=0;
    }
    int edgecount=0;

    while(edgecount<V-1)
    {
         int min=Integer.MAX_VALUE;
        int a=-1;
         int b=-1;

         for(int i=0;i<V;i++)
         {
             for(int j=0;j<V;j++)
             {
                 if(findparent(i)!=findparent(j) && cost[i][j]<min)
                 {
                    min=cost[i][j];
                     a=i;
                    b=j;
                 }
             }
         }
         union(a,b);
         System.out.printf("Edge %d:(%d, %d) cost:%d \n",edgecount++, a, b, min);
         mincost+=min;
        
    }
    System.out.print("Totalcost : "+mincost);
}
public static void main(String[]args){
    int cost[][] = {
        { INF, 2, INF, 6, INF },
        { 2, INF, 3, 8, 5 },
        { INF, 3, INF, INF, 7 },
        { 6, 8, INF, INF, 9 },
        { INF, 5, 7, 9, INF },
    };
 
    // Print the solution
    krushkalMST(cost);

}
}