import java.util.*;
public class raj{
static final int V=5;
static int path[];
static boolean issafe(int v,int graph[][],int path[],int pos)
{
       if(graph[path[pos-1]][v]==0)
       {
          return false;
       }

       for(int i=0;i<pos;i++)
        {
          if(path[i]==v)
          {
             return false;
          }
       }

       return true;

}
static boolean hamilutil(int graph[][],int path[],int pos)
{
     if(pos==V){
       if(graph[path[pos-1]][path[0]]==1)
       {
        return true;
       }else{
        return false;
       }
    }

    for(int v=1;v<V;v++)
    {
      
        if(issafe(v, graph, path, pos)==true)
        {
            path[pos]=v;
             if(hamilutil(graph, path, pos+1)==true)
             {
                return true;
             }
        }
        path[pos]=-1;
    }

    return false;
}

int hamiltonian(int graph[][])
{
    path=new int[V];
     
    for(int i=0;i<V;i++)
    {
        path[i]=-1;
    }
    path[0]=0;

    if(hamilutil(graph, path, 1)==false)
    {
        System.out.println("Not exists");
    }

    printsolution(path);
    return 1;
}
static void printsolution(int path[])
{
    for(int i=0;i<V;i++)
    {
        System.out.print(path[i]+" ");
    }
    System.out.println(" "+path[0]);
}
public static void main(String[]args){
  raj r=new raj();
       /* Let us create the following graph
           (0)--(1)--(2)
            |   / \   |
            |  /   \  |
            | /     \ |
           (3)-------(4)    */
           int graph1[][] = {{0, 1, 0, 1, 0},
           {1, 0, 1, 1, 1},
           {0, 1, 0, 0, 1},
           {1, 1, 0, 0, 1},
           {0, 1, 1, 1, 0},
       };

    r.hamiltonian(graph1);

       /* Let us create the following graph
           (0)--(1)--(2)
            |   / \   |
            |  /   \  |
            | /     \ |
           (3)       (4)    */
           int graph2[][] = {{0, 1, 0, 1, 0},
           {1, 0, 1, 1, 1},
           {0, 1, 0, 0, 1},
           {1, 1, 0, 0, 0},
           {0, 1, 1, 0, 0},
       };

       raj r2=new raj();

       r2.hamiltonian(graph2);
}
}