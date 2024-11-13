import java.util.*;
public class raj{
static int solve(int mat[][],int maxi,int n,int m)
{
      int row=n;
      int col=m;

     int curr[]=new int[col+1];
     int next[]=new int[col+1];
     
      for(int i=row-1;i>=0;i--)
      {
          for(int j=col-1;j>=0;j--)
          {
                  int right=curr[j+1];
                  int down=next[j];
                  int diagonal=next[j+1];
          if(mat[i][j]==1)
               {
                 curr[j]=1+Math.min(right,Math.min(down,diagonal));
                  maxi=Math.max(maxi,curr[j]);
               }else{
               curr[j]=0;
               }
          }
          next=curr;
      }
      return next[0];
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