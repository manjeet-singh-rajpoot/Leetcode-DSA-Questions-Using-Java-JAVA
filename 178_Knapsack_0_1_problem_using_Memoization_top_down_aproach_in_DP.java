import java.util.*;
public class maj{
  //Memoizen recursive top down approach//
static int knapsackRec(int dp[][],int W,int val[],int wt[],int n)
{
     if(n==0 || W==0)
     {
        return 0;
     }
     if(dp[n][W]!=-1)
     {
        return dp[n][W];
     }
     if(wt[n-1]>W)
     {
       dp[n][W]=knapsackRec(dp,W,val,wt,n-1);
       return dp[n][W];
     }
     else{
    int include=val[n-1]+knapsackRec(dp,W-wt[n-1],val,wt,n-1);

    int exclude=knapsackRec(dp,W,val,wt,n-1);

    dp[n][W]=Math.max(include,exclude);
 
    return dp[n][W];
     }
}
static int knapsack(int W,int wt[],int val[],int N)
{
      int dp[][]=new int[N+1][W+1];
      for(int i=0;i<N+1;i++)
      {
          for(int j=0;j<W+1;j++)
          {
            dp[i][j]=-1;
          }
      }

      return knapsackRec(dp,W,val,wt,N);
}
public static void main(String[]args){
      int profit[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };

        int W = 50;
        int N = profit.length;

        System.out.println(knapsack(W, weight, profit, N));

}
}
