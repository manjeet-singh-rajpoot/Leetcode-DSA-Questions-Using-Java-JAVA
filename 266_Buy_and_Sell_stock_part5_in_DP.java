import java.util.*;
public class raj{
static int solve(int arr[],int fee)
{
    int n=arr.length;
//int dp[][][]=new int[n+1][2][3];
   int curr[]=new int[2];
   int next[]=new int[2];
    for(int index=n-1;index>=0;index--)
    {
        for(int buy=0;buy<=1;buy++)
        {
                int profit=0;

                if(buy==1)
                {
                  //buy karo
                    int buykaro=-arr[index]+next[0];
                    int skipkaro=0+next[1];
              
                    profit=Math.max(buykaro,skipkaro);
                }else{
                  int sellkaro=+arr[index]+next[1]-fee;
                  int skipkaro=0+next[0];
                  profit=Math.max(sellkaro,skipkaro);
                }
               curr[buy]=profit;
            }
        next=curr;
    }
  return next[1];
}
public static void main(String[]args){
int prices[]={1,3,2,8,4,9};
int k=2;
System.out.print(solve(prices,k));    

}
}
