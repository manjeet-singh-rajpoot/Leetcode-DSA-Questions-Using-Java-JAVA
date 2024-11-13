import java.util.*;
public class raj{
static int solve(int arr[],int curr,int prev,int n)
{
    int dp[][]=new int[n+1][n+1];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            dp[i][j]=-1;
        }
    }
       if(curr==n)
       {
        return 0;
       }
    if(dp[curr][prev+1]!=-1)
    {
        return dp[curr][prev+1];
    }
      //include //
      int include=0;
      int exclude=0;
    if(prev==-1 || arr[curr]>arr[prev])
    {
        include=1+solve(arr,curr+1,curr,n);
    }else{
        exclude=0+solve(arr,curr+1,prev,n);
    }
   dp[curr][prev+1]=Math.max(include,exclude);

   return dp[curr][prev+1];
}
public static void main(String[]args){
    int arr[]={5,8,3,7,9,1};
    int n=arr.length;

    System.out.print(solve(arr,0,-1,n));

}
}