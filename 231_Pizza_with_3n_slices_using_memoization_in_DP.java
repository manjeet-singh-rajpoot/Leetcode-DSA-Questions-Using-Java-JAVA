import java.util.*;
public class raj{
static int solve(int arr[],int index,int endindex,int n,int dp[][])
{

      if(n==0 || index>endindex)
      {
        return 0;
      }
      if(dp[index][n]!=-1)
      {
           return dp[index][n];
      }
    int include=arr[index]+solve(arr,index+2,endindex,n-1,dp);
    int exclude=0+solve(arr,index+1,endindex,n,dp);

    return dp[index][n]=Math.max(include,exclude);
}
static int maxsize(int arr[])
{
    int n=arr.length;
    int dp1[][]=new int[n+1][n+1];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            dp1[i][j]=-1;
        }
    }
    int case1=solve(arr,0,n-2,n/3,dp1);
    int dp2[][]=new int[n+1][n+1];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            dp2[i][j]=-1;
        }
    }
    int case2=solve(arr,1,n-1,n/3,dp2);

    return Math.max(case1,case2);
}
public static void main(String[]args){
    int slices[]={1,2,3,4,5,6};
    System.out.print(maxsize(slices));

}
}