import java.util.*;
public class raj{
static int  solve(int arr[],int n)
{
    int dp[]=new int[n+1];

    for(int i=0;i<n+1;i++)
    {
        dp[i]=-1;
    }
    if(dp[n]!=-1)
    {
        return dp[n];
    }
    dp[0]=0;
    int mod=1000000007;
     if(n==1)
     {
        return 0;
     }
     if(n==2)
     {
        return 1;
     }
   int ans=(((n-1)%mod)*((solve(arr,n-1)%mod)+(solve(arr,n-2)%mod)))%mod;
    dp[n]=ans;

    return dp[n];

}
public static void main(String[]args){
    int arr[]={4,1,3};
    int n=3;
    System.out.print(solve(arr,n));

}
}