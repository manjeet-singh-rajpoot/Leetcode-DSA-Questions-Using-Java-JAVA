import java.util.*;
public class raj{
static int solve(int arr[],int k)
{
    int n=arr.length;
//int dp[][][]=new int[n+1][2][3];
   int curr[][]=new int[2][k+1];
   int next[][]=new int[2][k+1];
    for(int index=n-1;index>=0;index--)
    {
        for(int buy=0;buy<=1;buy++)
        {
            for(int limit=1;limit<=k;limit++)
            {
                int profit=0;

                if(buy==1)
                {
                  //buy karo
                    int buykaro=-arr[index]+next[0][limit];
                    int skipkaro=0+next[1][limit];
              
                    profit=Math.max(buykaro,skipkaro);
                }else{
                  int sellkaro=+arr[index]+next[1][limit-1];
                  int skipkaro=0+next[0][limit];
                  profit=Math.max(sellkaro,skipkaro);
                }
               curr[buy][limit]=profit;
            }
          
        }
        next=curr;
    }
  return next[1][k];
}
public static void main(String[]args){
int prices[]={2,4,1};
int k=2;
System.out.print(solve(prices,k));    

}
}
