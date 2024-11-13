import java.util.*;
public class raj{
static int solve(int n)
{
       int dp[]=new int[n+1];
     Arrays.fill(dp,Integer.MAX_VALUE);
         dp[0]=0;
    for(int i=1;i<=n;i++)
    {
         for(int j=1;j<=n;j++)
         {
            int temp=j*j;
           if(i-temp>=0)
            dp[i]=Math.min(dp[i],1+dp[i-temp]);
         }
    }
    return dp[n];
}
public static void main(String[]args){
    System.out.print(solve(6));

}
}