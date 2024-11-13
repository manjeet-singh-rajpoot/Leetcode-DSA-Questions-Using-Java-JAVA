import java.util.*;
public class raj{
static int solvememo(int coins[],int x,int dp[])
{

     int n=coins.length;
    
    if(x==0)
    {
        return 0;
    }
    if(x<0)
    {
        return Integer.MAX_VALUE;
    }
     if(dp[x]!=-1)
     {
        return dp[x];
     }
int mini=Integer.MAX_VALUE;
     for(int i=0;i<coins.length;i++)
     {
         int ans=solvememo(coins,x-coins[i],dp);
        if(ans!=Integer.MAX_VALUE)
        {
             mini=Math.min(mini,1+ans);   
        }
     }
   
     dp[x]=mini;
   
     return mini;
}
static int solve(int coins[],int x)
{
     int dp[]=new int[x+1];
     Arrays.fill(dp,-1);

     int ans=solvememo(coins,x,dp);
     if(ans==Integer.MAX_VALUE)
     {
          return -1;
     }
     return ans;
}
public static void main(String[]args){
    int coins[]={1,2,5};
    int x=11;
  System.out.print(solve(coins,x));
  

}
}
