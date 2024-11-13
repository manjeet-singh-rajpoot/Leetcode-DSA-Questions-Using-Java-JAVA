import java.util.*;
public class raj{       
static int solve(int arr[],int target,int []dp)
{
    
    dp[0]=1;

   if(dp[target]!=-1)
   {
    return dp[target];
   }
 for(int i=1;i<=target;i++)
 {
     for(int j=0;j<arr.length;j++)
     {
        if(i-arr[j]>=0)
        dp[i]=dp[i]+dp[i-arr[j]];
     }
 }
 return dp[target];
}
static int solvetab(int arr[],int target)
{
     int dp[]=new int[target+1];
     Arrays.fill(dp,0);

     return solve(arr, target,dp);
}
public static void main(String[]args){
    int arr[]={1,2,5};
    int target=5;
    System.out.print(solvetab(arr,target));

}
}