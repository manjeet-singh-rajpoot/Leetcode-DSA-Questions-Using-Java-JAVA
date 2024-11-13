import java.util.*;
public class raj{
static boolean solve(int arr[],int n,int index,int target,boolean dp[][])
{
      if(index>=n)
      {
        return false;
      }
      if(target<0)
      {
         return false;
      }
      if(target==0)
      {
        return true;
      }
     if(dp[index][target]!=false)
     {
          return true;
     }
    boolean include=solve(arr,n,index+1,target-arr[index],dp);
    boolean exclude=solve(arr,n,index+1,target-0,dp);
     
    return dp[index][target]=(include || exclude);
}
static boolean solve1(int arr[],int n)
{
      int total=0;
    for(int i=0;i<arr.length;i++)
    {
        total=total+arr[i];
    }
  if(total%2!=0)
  {
      return false;
  }
  int target=total/2;
  int index=0;
  boolean dp[][]=new boolean[n][target+1];
  for(int i=0;i<n;i++)
  {
      for(int j=0;j<n;j++)
      {
          dp[i][j]=false;
      
      }
  }
  return solve(arr,n,0,target,dp);

}
public static void main(String[]args){
    int arr[]={1,5,11,5};
    int n=4;
    System.out.print(solve1(arr,n));

}
}