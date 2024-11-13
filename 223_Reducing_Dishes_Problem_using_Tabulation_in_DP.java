import java.util.*;
public class raj{
static int solve(int arr[])
{
    int n=arr.length;
    Arrays.sort(arr);
  int dp[][]=new int[n+1][n+1];
     for(int index=n-1;index>=0;index--)
     {
      for(int time=index;time>=0;time--)
  {
    int include=arr[index]*(time+1)+dp[index+1][time+1];
    int exclude=0+dp[index+1][time];

      dp[index][time]=Math.max(include,exclude);
     }
    }
   return dp[0][0];
}
public static void main(String[]args){
    int satisfaction[]={-1,-8,0,5,-9};
    System.out.print(solve(satisfaction));

}
}