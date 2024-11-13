import java.util.*;
public class raj{
public static class Graph{
       static int V;
       int timer=0;
       LinkedList<Integer>adj[];
       static final int NIL=-1;
       Graph(int V)
       {
            this.V=V;
            adj=new LinkedList[V];
          for(int i=0;i<adj.length;i++)
          {
            adj[i]=new LinkedList<>();
          }
       }
void addEdge(int v,int w)
{
      adj[v].add(w);
      adj[w].add(v);
}
void bridge()
{
      int low[]=new int[V];
      int parent[]=new int[V];
      int disc[]=new int[V];
      boolean visited[]=new boolean[V];

      for(int i=0;i<V;i++)
      {
           parent[i]=NIL;
           visited[i]=false;
           low[i]=-1;
           disc[i]=-1;
      }

    for(int i=0;i<V;i++)
    {
          if(visited[i]==false)
          {
              bridgeutil(i,low,visited,parent,disc);
          }
    }
}
void bridgeutil(int u,int []low,boolean []visited,int []parent,int []disc)
{
      visited[u]=true;
      low[u]=timer++;
      disc[u]=timer++;

    Iterator<Integer>i=adj[u].iterator();
      //For adjecency or neghbour or Bachho ke liye  // 
    while(i.hasNext())
    {
        int v=i.next();
        //v works for adjecency or neghbour list i.e bachhe//
        //u works  node  e.i. papa ji
        if(!visited[v])
        {
            //bachho ke liye recursive approach//
            parent[v]=u;
            bridgeutil(v,low,visited,parent,disc);
           
            low[u]=Math.min(low[u],low[v]);
          
            //bridge checking//
            if(low[v]>disc[u])
            {
                System.out.println(u+" "+v);
            }
        }
        else if(v!=parent[u])
        {
             low[u]=Math.min(low[u],disc[v]);
        }
    }
}
}
public static void main(String[]args){
       System.out.println("Bridges in Second graph");
        Graph g2 = new Graph(4);
        g2.addEdge(0, 1);
        g2.addEdge(1, 2);
        g2.addEdge(2, 3);
        g2.bridge();
        System.out.println();

}
}