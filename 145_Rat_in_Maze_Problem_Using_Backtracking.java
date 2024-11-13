import java.util.*;
public class back{
static final int N=4;
static void printarr(int arr[][])
{
       for(int i=0;i<N;i++)
       {
         for(int j=0;j<N;j++)
         {
            System.out.print(arr[i][j]);
         }
         System.out.println();
       }
}
static boolean issafe(int arr[][],int x,int y)
{
    return (x>=0 && x<N  && y>=0 && y<N && arr[x][y]==1);
}
 boolean solvemaze(int arr[][])
{
    int solve[][]={{0,0,0,0},
                   {0,0,0,0},
                   {0,0,0,0},
                   {0,0,0,0}};
        if(solvemazeutil(arr,0,0,solve)==false){
            System.out.print("System does not exist");
            return false;
        }
        printarr(solve);
        return true;
}
static boolean solvemazeutil(int arr[][],int x,int y,int sol[][])
{
    if(x==N-1 && y==N-1)
    {
        sol[x][y]=1;
        return true;
    }
   if(issafe(arr, x, y)==true)
     {
         sol[x][y]=1;
        // Down D //
        if(solvemazeutil(arr,x+1,y,sol))
        {
            return true;
        }
           //Right R //
        if(solvemazeutil(arr,x,y+1,sol))
        {
            return true;
        }

        sol[x][y]=0;
        return false;
     }
     return false;
}
public static void main(String[]args){
    back rat = new back();
    int maze[][] = { { 1, 0, 0, 0 },
                     { 1, 1, 0, 1 },
                     { 0, 1, 0, 0 },
                     { 1, 1, 1, 1 } };
    rat.solvemaze(maze);
}
}
