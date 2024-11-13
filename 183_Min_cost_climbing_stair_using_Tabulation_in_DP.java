import java.util.*;
public class raj{
static int solve(int cost[],int n)
{
   
    int dp[]=new int[n+1];

    dp[0]=cost[0];
    dp[1]=cost[1];

    for(int i=2;i<n;i++)
    {
        dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
    }
    return Math.min(dp[n-1],dp[n-2]);
}
static int mincost(int cost[],int n)
{
    return solve(cost, n);
}
public static void main(String[]args){
    int cost[]={10,15,20};
    int n=cost.length;
    System.out.print(mincost(cost,n));

}
}
