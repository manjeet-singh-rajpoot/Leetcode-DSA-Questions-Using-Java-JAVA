import java.util.*;
public class sudoko{
static final int N=9;
static void print(int arr[][])
{
      for(int i=0;i<N;i++)
      {
        for(int j=0;j<N;j++)
        {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }
}
static boolean issafe(int board[][],int row,int col,int num)
{
        for(int i=0;i<N;i++)
        {
             if(board[row][i]==num)
             {
                return false;
             }
        }
      for(int i=0;i<N;i++)
      {
           if(board[i][col]==num)
           {
            return false;
           }
      }
      //check for 3*3 matrix
      int startrow=row-row%3;
      int startcol=col-col%3;
      for(int i=0;i<3;i++)
      {
          for(int j=0;j<3;j++)
          {
               if(board[i+startrow][j+startcol]==num)
               {
                return false;
               }
          }
      }
      return true;
}
static boolean solveSudoku(int board[][],int row,int col)
{
       if(row==N-1 && col==N-1)
       {
        return true;
       }
      if(col==N)
       {
         row=row+1;
         col=0;
       }
       if(board[row][col]!=0)
       {
           return solveSudoku(board,row,col+1);
       }
    for(int num=1;num<10;num++)
    {
          if(issafe(board, row, col, num))
          {
               board[row][col]=num;

               if(solveSudoku(board,row,col+1))
               {
                return true;
               }
          }
        board[row][col]=0;
    }
    return false;
}
public static void main(String[]args){
    int grid[][] = 
  { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
    { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
    { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
    { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
    { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
    { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
    { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
    { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
    { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

          if (solveSudoku(grid, 0, 0))
          {
            print(grid);
          }
        else{
          System.out.println("No Solution exists");
          }
}
}