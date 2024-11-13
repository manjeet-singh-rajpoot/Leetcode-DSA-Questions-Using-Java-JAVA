import java.util.*;
public class raj{
static int solve(int arr[],int n)
{
    int mod=1000000007;
    int dp[]=new int[n+1];
    for(int i=0;i<n+1;i++)
    {
        dp[i]=-1;
    }

    dp[1]=0;
    dp[2]=1;

     for(int i=3;i<=n;i++)
     {
          int first=dp[i-1]%mod;
          int second=dp[i-2]%mod;
          int third=(first+second)%mod;

          int ans=((i-1)*third)%mod;
          dp[i]=ans;
     }

return dp[n];

}
public static void main(String[]args){
     int arr[]={4,1,3};
    int n=3;
    System.out.print(solve(arr,n));


}
}