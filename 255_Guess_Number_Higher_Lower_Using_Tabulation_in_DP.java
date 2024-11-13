import java.util.*;
public class raj{
static int solve(int n)
{
int dp[][]=new int[n+2][n+2];

  for(int start=n;start>=1;start--)
   {
    for(int end=start;end<=n;end++)
    {
        if(start==end)
        {
            continue;
        }else{
            int ans=Integer.MAX_VALUE;
             for(int i=start;i<=end;i++)
             {
                 ans=Math.min(ans,i+Math.max(dp[start][i-1],dp[i+1][end])); 
             }
           dp[start][end]=ans;
        }
    }
   }

   return dp[1][n];
}
public static void main(String[]args){
   int n=10;
System.out.print(solve(n)); 
}
}