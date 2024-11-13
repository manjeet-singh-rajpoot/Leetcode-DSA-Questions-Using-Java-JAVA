import java.util.*;
public class graph{
    static int V;
   static LinkedList<Integer>adj[];
      graph(int V)
      {               //USING BFS undirect graph
           this.V=V;
           adj=new LinkedList[V];
           for(int i=0;i<adj.length;i++)
           {
               adj[i]=new LinkedList<Integer>();
           }
      }
void addEdge(int v,int w)
{
      adj[v].add(w);
      adj[w].add(v);
}
Boolean iscycleutil(int v,Boolean visited[],int parent)
{
       visited[v]=true;
       int i;
    Iterator<Integer>it=adj[v].iterator();
    while(it.hasNext())
    {
        i=it.next();

        if(!visited[i])
        {
            if(iscycleutil(i,visited,v))
            return true;
        }
        else if(i!=parent)
        return true;
    }
    return false;
}
Boolean isCyclic()
{
    Boolean visited[]=new Boolean[V];

    for(int i=0;i<V;i++)
    {
        visited[i]=false;
    }
   for(int u=0;u<V;u++)
   {
     if(!visited[u])
     {
        if(iscycleutil(u, visited, -1))
        return true;
     }
   }
   return false;
   
}
   public static void main(String[]args){
    graph g1 = new graph(5);
    g1.addEdge(1, 0);
    g1.addEdge(0, 2);
    g1.addEdge(2, 1);
    g1.addEdge(0, 3);
    g1.addEdge(3, 4);
    if (g1.isCyclic())
        System.out.println("Graph contains cycle");
    else
        System.out.println("Graph doesn't contain cycle");

    graph g2 = new graph(3);
    g2.addEdge(0, 1);
    g2.addEdge(1, 2);
    if (g2.isCyclic())
        System.out.println("Graph contains cycle");
    else
        System.out.println("Graph doesn't contain cycle");

}
}