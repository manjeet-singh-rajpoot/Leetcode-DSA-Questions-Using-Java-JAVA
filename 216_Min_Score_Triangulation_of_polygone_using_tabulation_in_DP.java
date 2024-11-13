import java.util.*;
public class raj{
static int solve(int arr[])
{
     int n=arr.length;
    int dp[][]=new int[n+1][n+1];
    
    for(int i=n-1;i>=0;i--)
    {
        for(int j=i+2;j<n;j++){
        int ans=Integer.MAX_VALUE;
             for(int k=i+1;k<j;k++){
             ans=Math.min(ans,arr[i]*arr[j]*arr[k]+dp[i][k]+dp[k][j]);
          }
          dp[i][j]=ans;
        } 
    }
    return dp[0][n-1];
}
public static void main(String[]args){
    int arr[]={1,2,3};
    int n = arr.length;
    
    System.out.print(solve(arr));
}
}