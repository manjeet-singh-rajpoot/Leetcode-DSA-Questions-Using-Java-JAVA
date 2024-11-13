import java.util.*;
public class raj{
static int mod=1000000007;
static int add(int a,int b)
{
    return ((a%mod)+b%mod)%mod;
}
static int multi(int a,int b)
{
    return ((a%mod)*b%mod)%mod;
}
static int solve(int n,int k)
{
  int dp[]=new int[n+1];
  Arrays.fill(dp,-1);
     if(n==1)
     {
        return k;
     }
     if(n==2)
     {
         return add(k,multi(k,(k-1)));
     }
    if(dp[n]!=-1)
    {
        return dp[n];
    }
  
    int ans=add(multi(solve(n-2,k),k-1),multi(solve(n-1,k),k-1));
     dp[n]=ans;
     return dp[n];
}
public static void main(String[]args){
    int n=3,k=2;
    System.out.print(solve(n,k));
}
}
