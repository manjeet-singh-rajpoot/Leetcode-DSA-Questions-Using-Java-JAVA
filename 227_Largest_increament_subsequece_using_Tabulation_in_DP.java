import java.util.*;
public class raj{
static int solve(int arr[],int n)
{
   int dp[][]=new int[n+1][n+1];
   
    for(int curr=n-1;curr>=0;curr--){
       for(int prev=curr-1;prev>=-1;prev--)
        {
         int include=0;
         if(prev==-1 || arr[curr]>arr[prev])
       {
        include=1+dp[curr+1][curr+1];
        }
       int exclude=0+dp[curr+1][prev+1];
        
       dp[curr][prev+1]=Math.max(include,exclude);
    }
}
   return dp[0][0];
}
public static void main(String[]args){
    int arr[]={5,8,3,7,9,1};
    int n=arr.length;

    System.out.print(solve(arr,n));

}
}
