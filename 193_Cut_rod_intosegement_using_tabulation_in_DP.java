import java.util.*;
public class raj{
static int findMaximum(int n,int x,int y,int z)
{
      int dp[]=new int[n+1];
      for(int i=0;i<n+1;i++)
      {
          dp[i]=-1;
      }
    dp[0]=0;

for(int i=0;i<=n;i++)
{
    if(dp[i]==-1)
    continue;

    if(i+x<=n)
    {
        dp[i+x]=Math.max(dp[i+x],dp[i]+1);
    }
    if(i+y<=n)
    {
        dp[i+y]=Math.max(dp[i+y],dp[i]+1);
    }
    if(i+z<=n)
    {
        dp[i+z]=Math.max(dp[i+z],dp[i]+1);
    }
}

  if(dp[n]==-1)
  {
    dp[0]=0;
  }

  return dp[n];
}
public static void main(String[]args){
    int l = 11, p = 2, q = 3, r = 5;

    // Calling Function
    int ans = findMaximum(l, p, q, r);
    System.out.println(ans); 

}
}