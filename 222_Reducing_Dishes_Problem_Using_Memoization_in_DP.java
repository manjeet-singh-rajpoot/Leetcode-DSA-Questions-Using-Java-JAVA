import java.util.*;
public class raj{
static int solve(int arr[],int index,int time)
{
    int n=arr.length;
    Arrays.sort(arr);
  int dp[][]=new int[n+1][n+1];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
        dp[i][j]=-1;
    }
  }
       if(index==arr.length)
       {
        return 0;
       }
     if(dp[index][time]!=-1)
     {
        return dp[index][time];
     }
    int include=arr[index]*(time+1)+solve(arr,index+1,time+1);
    int exclude=0+solve(arr,index+1,time);

   dp[index][time]=Math.max(include,exclude);

   return dp[index][time];
}
public static void main(String[]args){
    int satisfaction[]={-1,-8,0,5,-9};
    System.out.print(solve(satisfaction,0,0));

}
}