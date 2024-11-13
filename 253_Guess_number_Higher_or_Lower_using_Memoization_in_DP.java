import java.util.*;
public class raj{
static int solve(int s,int e,int n)
{
    int dp[][]=new int[n+1][n+1];
    for(int i=0;i<=n;i++)
    {
         for(int j=0;j<=n;j++)
         {
             dp[i][j]=-1;
         }
    }
    if(s>=e)
    {
        return 0;
    }
    if(dp[s][e]!=-1)
    {
        return dp[s][e];
    }
   int ans=Integer.MAX_VALUE;

   for(int i=s;i<=e;i++)
   {
      ans=Math.min(ans,i+Math.max(solve(s,i-1,n),solve(i+1,e,n)));
   }

   return dp[s][e]=ans;
}
public static void main(String[]args){
int n=10;
//op 16
System.out.print(solve(1,n,n)); 

}
}