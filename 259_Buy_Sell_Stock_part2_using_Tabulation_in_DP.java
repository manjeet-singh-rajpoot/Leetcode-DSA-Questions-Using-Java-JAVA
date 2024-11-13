import java.util.*;
public class raj{
static int solve(int arr[])
{
    int n=arr.length;
    int dp[][]=new int[n+1][2];
    
    for(int index=n-1;index>=0;index--)
    {
         for(int buy=0;buy<=1;buy++)
         {
             int profit=0;
            if(buy==1)
            {
                int buykaro=-arr[index]+dp[index+1][0];
                int skip=0+dp[index+1][1];

                profit=Math.max(buykaro,skip);
            }else{
                int sellkaro=+arr[index]+dp[index+1][1];
                int skip=0+dp[index+1][1];
                profit=Math.max(sellkaro,skip);
            }
            dp[index][buy]=profit;
         }
    }
    return dp[0][1];
}
public static void main(String[]args){
    int arr[]={7,1,5,3,6,4};
    int n=arr.length;
    System.out.print(solve(arr));


}
}