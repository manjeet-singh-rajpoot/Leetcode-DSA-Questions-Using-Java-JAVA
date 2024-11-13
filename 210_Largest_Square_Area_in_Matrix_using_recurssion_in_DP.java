import java.util.*;
public class raj{
static int solve(int mat[][],int i,int j,int maxi)
{
      if(i>=mat.length || j>=mat.length)
      {
        return 0;
      }

    int right=solve(mat,i,j+1,maxi);
    int diagonal=solve(mat,i+1,j+1,maxi);
    int down=solve(mat,i+1,j,maxi);

    if(mat[i][j]==1)
    {
           int ans=1+Math.min(right,Math.min(diagonal,down));
           maxi=Math.max(maxi,ans);
           return ans;
    }else{
        return 0;
    }
}
static int square(int mat[][],int n,int m)
{
     int maxi=0;
    return  solve(mat,0,0,0);
    
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