import java.util.*;
import java.io.*;
public class graph{
 static void addEdge(LinkedList<LinkedList<Integer>>adj,int u,int v)
{
     adj.get(u).add(v);
    
}
static void print(LinkedList<LinkedList<Integer>>adj)
{
      for(int i=0;i<adj.size();i++)
      {
        if(adj.get(i).size()!=0){
             System.out.print(i+"->");
        for(int v:adj.get(i))
        {
            System.out.print(v+" ");
        }
      System.out.println();
      }
}
}
public static void main(String[]args){
    int v=5;
LinkedList<LinkedList<Integer>>adj=new LinkedList<LinkedList<Integer>>();
for(int i=0;i<v;i++)
{
      adj.add(new LinkedList<Integer>());
}
addEdge(adj, 0, 1);
addEdge(adj, 0, 4);
addEdge(adj, 1, 2);


print(adj);

}
}
