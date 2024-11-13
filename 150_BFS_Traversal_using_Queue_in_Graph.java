import java.util.*;
public class graph{
public static class pair{
    int first;
    int second;
    pair(int first,int second)
    {
         this.first=first;
         this.second=second;
    }
}
static int Row=4;
static int Col=4;

//Direction 
static int drow[]={-1,0,1,0};
static int dcol[]={0,1,0,-1};

static boolean isvalid(boolean vis[][],int row,int col)
{
     if(row<0  || col<0 || row>=Row ||col >=Col)
     {
        return false;
     }
     if(vis[row][col])
     {
        return false;
     }
     return true;
}
static void BFS(int grid[][],boolean vis[][],int row,int col)
{
       Queue<pair>q=new LinkedList<>();
       q.add(new pair(row,col));
       vis[row][col]=true;
       while(!q.isEmpty())
       {
          pair cell=q.peek();
          int x=cell.first;
          int y=cell.second;
          System.out.print(grid[x][y]+" ");

          q.remove();

          for(int i=0;i<4;i++)
          {
              int adj=x+drow[i];
              int adjy=y+dcol[i];

              if(isvalid(vis, adj, adjy))
              {
                q.add(new pair(adj,adjy));
                vis[adj][adjy]=true;
              }
          }
       }
}
public static void main(String[]args){
    int grid[][] = { { 1, 2, 3, 4 },
    { 5, 6, 7, 8 },
    { 9, 10, 11, 12 },
    { 13, 14, 15, 16 } };

// Declare the visited array
boolean [][]vis = new boolean[Row][Col];

BFS(grid, vis, 0, 0);

}
}