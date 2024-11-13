import java.util.*;
public class raj{
static int solve(int mat[][],int maxi,int n,int m)
{
      int row=n;
      int col=m;

      int dp[][]=new int[row+1][col+1];
     
      for(int i=row-1;i>=0;i--)
      {
          for(int j=col-1;j>=0;j--)
          {
                  int right=dp[i][j+1];
                  int down=dp[i+1][j];
                  int diagonal=dp[i+1][j+1];
          if(mat[i][j]==1)
               {
                  dp[i][j]=1+Math.min(right,Math.min(down,diagonal));
                  maxi=Math.max(maxi,dp[i][j]);
               }else{
                dp[i][j]=0;
               }
          }
      }
      return dp[0][0];
}
public static void main(String[]args){
    int n=2;
    int m=2;
    int mat[][]=
    {
       {1,1},
       {1,1},
    } ;
 System.out.print( solve(mat,0,n,m));
}
}