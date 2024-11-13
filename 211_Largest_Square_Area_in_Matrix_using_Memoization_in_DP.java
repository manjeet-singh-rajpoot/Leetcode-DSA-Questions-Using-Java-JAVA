import java.util.*;
public class raj{
static int solve(int mat[][],int i,int j,int maxi,int dp[][])
{
      if(i>=mat.length || j>=mat[0].length)
      {
        return 0;
      }
    if(dp[i][j]!=-1)
    {
        return dp[i][j];
    }
    int right=solve(mat,i,j+1,maxi,dp);
    int diagonal=solve(mat,i+1,j+1,maxi,dp);
    int down=solve(mat,i+1,j,maxi,dp);

    if(mat[i][j]==1)
    {
          dp[i][j]=1+Math.min(right,Math.min(diagonal,down));
           maxi=Math.max(maxi,dp[i][j]);
           return dp[i][j];
    }else{
      return dp[i][j]=0;
    }
}
static int square(int mat[][],int n,int m)
{
     int dp[][]=new int[n][m];
     for(int i=0;i<n;i++)
     {
        for(int j=0;j<m;j++)
        {
            dp[i][j]=-1;
        }
     }
  //  Arrays.fill(dp,-1);
    return  solve(mat,0,0,0,dp);
    
}
public static void main(String[]args){
   int n=2;
   int m=2;
   int mat[][]=
   {
      {1,1},
      {1,1},
   } ;
System.out.print(square(mat,n,m));
}
}
