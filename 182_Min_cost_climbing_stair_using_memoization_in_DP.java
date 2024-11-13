import java.util.*;
public class raj{
static int solve(int cost[],int n,int dp[])
{
      if(n==0)
      return cost[0];
      if(n==1)
      return cost[1];

      dp[n]=cost[n]+Math.min(solve(cost,n-1,dp),solve(cost,n-2,dp));

      return dp[n];
}
static int mincost(int cost[],int n)
{
        int dp[]=new int[n+1];
      dp[n]=Math.min(solve(cost,n-1,dp),solve(cost,n-2,dp));
       return dp[n];
}
public static void main(String[]args){
    int cost[]={10,15,20};
    int n=cost.length;
    System.out.print(mincost(cost,n));

}
}
