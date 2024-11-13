import java.util.*;
public class raj{
    public static class Graph{
         static int V;
         static LinkedList<Integer>adj[];
         Graph(int V)
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
 boolean isCycle()
 {
      int indegree[]=new int[V];
      Queue<Integer>q=new LinkedList<>();

      for(int i=0;i<V;i++)
      {
         for(int w:adj[i])
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
      //for visited vertices//
      int count=0;

      Vector<Integer>x=new Vector<>();

    while(!q.isEmpty())
    {
        int v=q.poll();

       x.add(v);

        for(int b:adj[v])
        {
             if(--indegree[b]==0)
             {
                q.add(b);
             }
        }
        count++;
    }
if(count!=V)
{
    return true;
}else
return false;

 }
 }
public static void main(String[]args){
     Graph g = new Graph(6);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(3, 4);
        g.addEdge(4, 5);
 
       
        if (g.isCycle())
            System.out.println("Yes");
        else
            System.out.println("No");
            

}
}