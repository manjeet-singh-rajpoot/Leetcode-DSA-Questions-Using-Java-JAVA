import java.util.*;
public class raj{
static boolean solve(int arr[],int n,int total)
{
     boolean dp[][]=new boolean[n+1][total+1];
    for(int i=0;i<=n;i++)
    {   
         dp[i][0]=true;
    }
  
       for(int index=n-1;index>=0;index--)
       {  
          for(int target=0;target<=total/2;target++)
          {
            boolean include=false;
               if(target-arr[index]>=0){
                 include=dp[index+1][target-arr[index]];
               }
            boolean exclude=dp[index+1][target-0];

            dp[index][target]=(include||exclude);
          }
       }
     
    return dp[0][total/2];
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
  
  return solve(arr,n,total);

}
public static void main(String[]args){
    int arr[]={1,5,11,5};
    int n=4;
    System.out.print(solve1(arr,n));

}
}