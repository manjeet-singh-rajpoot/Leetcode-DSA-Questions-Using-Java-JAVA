import java.util.*;
public class raj{
     //Tabulation bottom to up Approach//
static int knapsack(int W,int val[],int wt[],int n)
{
       int dp[][]=new int[n+1][W+1];
      for(int i=0;i<=n;i++)
      {
        for(int j=0;j<=W;j++)
        {
             if(i==0 || j==0)
             {
                  dp[i][j]=0;
             }
             else if(wt[i-1]<=j)
             {
               int include=val[i-1]+dp[i-1][j-wt[i-1]];
               int exclude=dp[i-1][j];

               dp[i][j]=Math.max(include,exclude);

             }else{
                  dp[i][j]=dp[i-1][j];
             }
        }
      }
      return dp[n][W];
}
public static void main(String[]args){
    int profit[] = new int[] { 60, 100, 120 };
    int weight[] = new int[] { 10, 20, 30 };
    int W = 50;
    int n = profit.length;
    System.out.println(knapsack(W,profit,weight,n));    

}
}