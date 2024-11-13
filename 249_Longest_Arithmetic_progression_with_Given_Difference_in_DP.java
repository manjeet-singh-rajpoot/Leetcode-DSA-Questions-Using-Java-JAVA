import java.util.*;
public class raj{
static int solve(int arr[],int d,int n)
{           //Small mistack//
   int dp[]=new int[n+1];
    int ans=0;

    for(int i=0;i<n;i++)
    {
        int temp=arr[i]-d;
        int tempans=0;
         
        if(dp[temp]==1)
        {
            tempans=dp[temp];
        }

        dp[arr[i]]=1+tempans;

        ans=Math.max(ans,dp[arr[i]]);
        
    }

    return ans;
   

}
public static void main(String[]args){
int arr[]={1,2,3,4};
int d=1;
int n=arr.length;
System.out.print(solve(arr,d,n));

}
}