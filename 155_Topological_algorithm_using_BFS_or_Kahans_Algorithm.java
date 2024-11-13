import java.util.*;
public class radha{
public static class Graph{
        static int V;
         List<Integer>adj[];
    Graph(int V)
    {
         this.V=V;
         adj=new ArrayList[V];
        for(int i=0;i<adj.length;i++)
        {
         adj[i]=new ArrayList<Integer>();
        }
    }
 void addEdge(int v,int w)
{
     adj[v].add(w);
}
void topologicalSort()
{
      int indegree[]=new int[V];

      Queue<Integer>q=new LinkedList<>();

    for(int v=0;v<V;v++)
    {
         for(int w:adj[v])
         {
            indegree[w]++;
         }
    }

    for(int i=0;i<V;i++)
    {
         if(indegree[i]==0)
         {
            q.add(i);
         }
    }

    while(!q.isEmpty())
    {
        int v=q.poll();
        System.out.print(v+" ");

        for(int w:adj[v])
        {
             if(--indegree[w]==0)
             {
                q.add(w);
             }
        }
    }
}
}
public static void main(String[]args){
    Graph graph = new Graph(6);
    graph.addEdge(5, 2);
    graph.addEdge(5, 0);
    graph.addEdge(4, 0);
    graph.addEdge(4, 1);
    graph.addEdge(2, 3);
    graph.addEdge(3, 1);

    System.out.println("Topological sorting:");
    graph.topologicalSort();

}
}