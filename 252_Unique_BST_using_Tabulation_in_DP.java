import java.util.*;
public class raj{
static int uniqBST(int n)
{
    int dp[]=new int[n+1];
    dp[0]=1;
    dp[1]=1;

    for(int i=2;i<=n;i++)
    {
          //root node
        for(int j=1;j<=i;j++)
        {
            dp[i]=dp[i]+dp[j-1]*dp[i-j];
        }
    }

    return dp[n];
}
public static void main(String[]args){
    int n=3;
    System.out.print(uniqBST(n));

}
}