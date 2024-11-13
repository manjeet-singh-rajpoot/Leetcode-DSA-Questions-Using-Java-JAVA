import java.util.*;
public class raj{       //Mistack//
static int solve(int arr[],int target)
{
    int dp[]=new int[target+1];
  
   Arrays.fill(dp,0);
   if(target==0)
   {
   return 1;
   }
  if(target<0)
  {
    return 0;
  }
   if(dp[target]!=-1)
   {
    return dp[target];
   }
   int ans=0;
 for(int i=0;i<=arr.length;i++)
 {
     ans=ans+solve(arr,target-arr[i]);
 }
 dp[target]=ans;
 return dp[target];
}
public static void main(String[]args){
    int arr[]={1,2,5};
    int target=5;
    System.out.print(solve(arr,target));

}
}