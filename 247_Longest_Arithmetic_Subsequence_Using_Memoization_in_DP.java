import java.util.*;
public class raj{
static int solve1(int arr[],int n)
{
       if(n<=2)
       {
          return n;
       }
       int ans=0;

       for(int i=0;i<n;i++)
       {
           for(int j=i+1;j<n;j++)
           {
               ans=Math.max(ans,2+solve(arr,arr[j]-arr[i],i));
           }
       }

       return ans;
}
static int solve(int arr[],int diff,int index)
{
    int n=arr.length;
    int dp[][]=new int[n+1][diff+1];
    
    for(int i=0;i<=n;i++)
    {
        for(int j=0;j<=diff;j++)
        {
            dp[i][j]=-1;
        }
    }
    if(index<0)
       {
        return 0;
       }
    if(dp[index][diff]!=-1)
    {
        return dp[index][diff];
    }

       int ans=0;

       for(int j=index-1;j>=0;j--)
       {
            if(arr[index]-arr[j]==diff)
            {
                ans=Math.max(ans,1+solve(arr,diff,j));
            }
       }
   dp[index][diff]=ans;
       return dp[index][diff];
}
public static void main(String[]args){
int arr[]={1,7,10,13,14,19};
int n=arr.length;
System.out.print(solve1(arr,n));    

}
}