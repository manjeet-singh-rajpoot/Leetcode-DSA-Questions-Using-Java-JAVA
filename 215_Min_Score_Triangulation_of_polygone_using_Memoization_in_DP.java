import java.util.*;
public class raj{
static int solve(int arr[],int i,int j,int dp[][])
{
     int n=arr.length;
      if(i+1==j)
      {
         return 0;
      } 

      if(dp[i][j]!=-1)
      {
        return dp[i][j];
      }

    int ans=Integer.MAX_VALUE;
    for(int k=i+1;k<j;k++)
    {
        ans=Math.min(ans,arr[i]*arr[j]*arr[k]+solve(arr,i,k,dp)+solve(arr,k,j,dp));
    }

      dp[i][j]=ans;

      return dp[i][j];
}
static int solve1(int arr[])
{
    int i=0;
    int n=arr.length;
    int j=arr.length-1;
    int dp[][]=new int[n][n];
    for(int l=0;l<n;l++)
    {

       for(int m=0;m<n;m++)
       {
           dp[l][m]=-1;
       }

    }

    return solve(arr, 0, n-1,dp);
}
public static void main(String[]args){
    int arr[]={1,2,3};
    int n = arr.length;
    
    System.out.print(solve1(arr));
}
}