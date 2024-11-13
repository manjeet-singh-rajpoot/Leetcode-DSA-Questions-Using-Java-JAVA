import java.util.*;
import java.io.*;
 
class raj
{
    static int getMinSquares(int n)
    {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        // base cases
        if (n == 0)
            return 0;
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        int ans = n; 
        // n (1*1 + 1*1 + ..)
        for (int x = 1; x <= n; x++) 
        {
            int temp = x * x;
            if (temp > n)
                break;
            else
                ans = Math.min(ans, 1 + 
                          getMinSquares(n - temp));
        }
        dp[n]=ans;
        return dp[n];
    }
   
    // Driver code
    public static void main(String args[])
    {
        System.out.println(getMinSquares(6));
    }
}