import java.util.*;
public class raj{
static int uniqBST(int n)
{
    int dp[]=new int[n+1];
    for(int i=0;i<=n;i++)
    {
         dp[i]=-1;
    }
     if(n<=1)
     {
          return 1;
     }
     if(dp[n]!=-1)
     {
        return dp[n];
     }
    int ans=0;
    for(int i=1;i<=n;i++)
    {
       ans=ans+uniqBST(i-1)*uniqBST(n-i);
    }
    dp[n]=ans;
    return dp[n];
}
public static void main(String[]args){
    int n=3;
    System.out.print(uniqBST(n));

}
}