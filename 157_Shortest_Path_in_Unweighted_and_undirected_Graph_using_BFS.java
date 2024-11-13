import java.util.*;
public class man{
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
   void add_edge(int v,int w)
   {
      adj[v].add(w);
      adj[w].add(v);
   }
Vector<Integer>shortestpath(int s,int d)
{
       boolean visited[]=new boolean[V];  //Visited=//[true,0,0,0,0,0]
       Queue<Integer>q=new LinkedList<>();//Queue=//[1,0,0,0,0,0]
       Vector<Integer>ans=new Vector<>(); //ans=//[0,0,0,0,0,0]
       int prev[]=new int[V];             //prev[]=//[-1,0,0,0,0,0]
       
        q.add(s);
        visited[s]=true;
        prev[s]=-1;   //Because it has no parent 
      
        while(!q.isEmpty())
        {
            int front=q.peek();//front = 1
              q.remove();//remove 1
           
           //Now For adjecency List//

           for(int i:adj[front])
           {
               if(visited[i]==false)
                 {
                    visited[i]=true;
                    prev[i]=front;
                    q.add(i);
                }
           }
        }

        //prepare Shortest Path//

      int current=d;
      ans.add(d);

       while(current!=s){
          current=prev[current];
          ans.add(current);
       }
       
     Collections.reverse(ans);

    for(int u:ans)
    {
        System.out.print(u+" ");
    }
       return ans;
}
}
public static void main(String[]args){
      Graph g=new Graph(6);

      g.add_edge(0, 1);
      g.add_edge(0, 2);
      g.add_edge(1, 3);
      g.add_edge(1, 4);
      g.add_edge(2, 3);
      g.add_edge(3, 5);
      g.add_edge(4, 5);

      int s=0;
      int d=5;

      g.shortestpath(s, d);

}
}