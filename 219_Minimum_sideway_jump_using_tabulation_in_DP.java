import java.util.*;
public class raj{
static int solve(int obs[])
{
   int n=obs.length-1;
    int dp[][]=new int[n+1][n+1];
    
    dp[0][n]=0;
    dp[1][n]=0;
    dp[2][n]=0;
    dp[3][n]=0;

    for(int pos=n-1;pos>=0;pos--)
    {
          for(int lane=1;lane<=3;lane++)
          {
                if(obs[pos+1]!=lane)
                {
                    dp[lane][pos]=dp[lane][pos+1];
                }else{
                   int ans=Integer.MAX_VALUE;

                   for(int i=1;i<=3;i++)
                   {
                      if(lane!=i && obs[pos]!=i)
                      {
                          ans=Math.min(ans,1+dp[i][pos+1]);
                      }
                   }
                   dp[lane][pos]=ans;
                }
          }
    }
    return Math.min(dp[2][0],Math.min(1+dp[1][0],1+dp[3][0]));
  
}
public static void main(String[]args){
    int obst[]={0,1,2,3,0};
    int n=obst.length;

System.out.print(solve(obst));

}
}
