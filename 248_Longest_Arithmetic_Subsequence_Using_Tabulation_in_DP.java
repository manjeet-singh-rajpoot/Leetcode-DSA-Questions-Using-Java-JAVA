import java.util.*;
public class raj{
static int solve1(int arr[],int n)
{         //Small mistack//               
     if(n<=2)
     {
        return n;
     }

     int ans=0;

     for(int i=1;i<n;i++)
     {
        for(int j=0;j<i;j++)
        {
            int diff=arr[i]-arr[j];
            int count=1;
            int dp[][]=new int[n+1][diff+1];
             if(dp[j][diff]==count)
             {
                count=dp[j][diff];
             }

             dp[i][diff]=1+count;
             ans=Math.max(ans,dp[i][diff]);
        }
     }

     return ans;
}
public static void main(String[]args){
//int arr[]={1,7,10,13,14,19};
int arr[]={5, 10, 15, 20, 25, 30};
int n=arr.length;
System.out.print(solve1(arr,n));    

}
}
