import java.util.*;
public class raj{
static int solve(int obs[],int n,int lane,int pos)
{
    n=obs.length-1;
    int dp[][]=new int[n+1][n+1];
    for(int i=0;i<=n;i++)
    {
        for(int j=0;j<=n;j++)
        {
            dp[i][j]=-1;
        }
    }
    if(pos==n)
    {
        return 0;
    }
   if(dp[lane][pos]!=-1)
   {
     return dp[lane][pos];
   }
  if(obs[pos+1]!=lane)
  {
     return solve(obs,n,lane,pos+1);
  }else{

    //sideway jum
    int ans=Integer.MAX_VALUE;
     for(int i=1;i<=3;i++)
     {
         if(lane!=i && obs[pos]!=i)
         {
            ans=Math.min(ans,1+solve(obs,n,i,pos));
         }
     }
    dp[lane][pos]=ans;
     return  dp[lane][pos];
  }
}
public static void main(String[]args){
    int obst[]={0,1,2,3,0};
    int n=obst.length;

System.out.print(solve(obst,n,2,0));

}
}
