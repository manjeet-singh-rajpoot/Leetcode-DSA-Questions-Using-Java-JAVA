import java.util.*;
public class raj{
static int solve(int arr[],int buy,int index,int limit)
{
    int n=arr.length;
int dp[][][]=new int[n][2][3];
for(int i=0;i<n;i++)
{
    for(int j=0;j<2;j++)
    {
        for(int k=0;k<3;k++)
        {
            dp[i][j][k]=-1;
        }
    }
}

    if(index==arr.length)
    {
        return 0;
    }
    if(limit==0)
    {
        return 0;
    }
    if(dp[index][buy][limit]!=-1)
    {
        return dp[index][buy][limit];
    }
  int profit=0;

  if(buy==1)
  {
    //buy karo
      int buykaro=-arr[index]+solve(arr,0,index+1,limit);
      int skipkaro=0+solve(arr,1,index+1,limit);

      profit=Math.max(buykaro,skipkaro);
  }else{
    int sellkaro=+arr[index]+solve(arr,1,index+1,limit-1);
    int skipkaro=0+solve(arr,0,index+1,limit);
    profit=Math.max(sellkaro,skipkaro);
  }

  return dp[index][buy][limit]=profit;
}
public static void main(String[]args){
int prices[]={3,3,5,0,0,3,1,4};
System.out.print(solve(prices,1,0,2));    

}
}
