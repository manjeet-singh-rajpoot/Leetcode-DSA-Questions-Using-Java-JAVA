import java.util.*;
public class raj{
public static class graph{
    static int V;              //Topological sort using DFS //
    static LinkedList<Integer>adj[];
    graph(int V)
    {
        this.V=V;
        adj=new LinkedList[V];
        for(int i=0;i<adj.length;i++)
        {
            adj[i]=new LinkedList<>();    
        }
    }
void addEdge(int v,int e)
{
     adj[v].add(e);
}
void toposortutil(int v,boolean visited[],Stack<Integer>s)
{
    visited[v]=true;

     int i;

    Iterator<Integer>it=adj[v].iterator();

    while(it.hasNext())
    {
        i=it.next();

        if(!visited[i])
        {
            toposortutil(i,visited,s);
        }
    }
   s.push(v);
}
void toposort()
{
   Stack<Integer>s=new Stack<>();
   
   boolean visited[]=new boolean[V];

    for(int i=0;i<V;i++)
    {
         visited[i]=false;
    }
     
  for(int i=0;i<V;i++)
  {
       if(visited[i]==false)
       {
            toposortutil(i,visited,s);
       }
  }
  while(s.empty()==false)
  {
     System.out.print(s.pop()+" ");
  }
}
}
public static void main(String[]args){
    graph g=new graph(6);
    g.addEdge(5, 2); 
        g.addEdge(5, 0); 
        g.addEdge(4, 0); 
        g.addEdge(4, 1); 
        g.addEdge(2, 3); 
        g.addEdge(3, 1); 
     
        g.toposort();
}
}