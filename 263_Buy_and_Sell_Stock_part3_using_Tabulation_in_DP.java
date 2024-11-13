import java.util.*;
public class raj{
static int solve(int arr[])
{
    int n=arr.length;
int dp[][][]=new int[n+1][2][3];

    for(int index=n-1;index>=0;index--)
    {
        for(int buy=0;buy<=1;buy++)
        {
            for(int limit=1;limit<=2;limit++)
            {
                int profit=0;

                if(buy==1)
                {
                  //buy karo
                    int buykaro=-arr[index]+dp[index+1][0][limit];
                    int skipkaro=0+dp[index+1][1][limit];
              
                    profit=Math.max(buykaro,skipkaro);
                }else{
                  int sellkaro=+arr[index]+dp[index+1][1][limit-1];
                  int skipkaro=0+dp[index+1][0][limit];
                  profit=Math.max(sellkaro,skipkaro);
                }
                dp[index][buy][limit]=profit;
            }
        }
    }
  return dp[0][1][2];
}
public static void main(String[]args){
int prices[]={3,3,5,0,0,3,1,4};
System.out.print(solve(prices));    

}
}
