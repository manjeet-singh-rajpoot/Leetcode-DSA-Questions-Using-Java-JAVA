import java.util.*;
public class raj{
static final int N=4;
static void displayarr(int board[][])
{
    for(int i=0;i<N;i++)
    {
        for(int j=0;j<N;j++)
        {
            System.out.print(board[i][j]+" ");
        }
        System.out.println();
    }
}
static boolean issafe(int board[][],int row,int col)
{
    int i;
    int j;

   for(i=0;i<col;i++)
    {
         //Check for row on left side//
        if(board[row][i]==1)
        {
            return false;
        }
       
    }
    //upper diogonal//
   for(i=row,j=col; i>=0 && j>=0; i--,j--)
   {
         if(board[i][j]==1)
         {
            return false;
         }
   }
     //Lower diagonal//
  for(i=row,j=col; i<N && j>=0 ;i++,j--)
  {
     if(board[i][j]==1)
     {
        return false;
     }
  }
  return true;
}

static boolean solvenQueen(int board[][],int col)
{
    //if all queen placed succesfully//
        if(col>=N)
        {
            return true;
        }
  for(int i=0;i<N;i++)
  {
         if(issafe(board, i, col))
         {
            board[i][col]=1;
          if(solvenQueen(board, col+1)==true)
          {
            return true;
          }
         }
        board[i][col]=0;
  }
  return false;
}
 boolean solvenQ()
{
    int solve[][]={{0,0,0,0},
                   {0,0,0,0},
                   {0,0,0,0},
                   {0,0,0,0}};
    if(solvenQueen(solve,0)==false){
         return false;
    }
    displayarr(solve);
    return true;
}
public static void main(String[]args){
    raj j=new raj();
    j.solvenQ();

}
}