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

    dp[1]=k;
    dp[2]=add(k,multi(k,(k-1)));
   
  for(int i=3;i<=n;i++){
    dp[i]=add(multi(dp[i-2],k-1),multi(dp[i-1],k-1));
}
     return dp[n];
}
public static void main(String[]args){
    int n=3,k=2;
    System.out.print(solve(n,k));
}
}
