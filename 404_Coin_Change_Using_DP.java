
/*
 * Question : 
 * 
 *    You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

You may assume that you have an infinite number of each kind of coin.

 

Example 1:

Input: coins = [1,2,5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1
Example 2:

Input: coins = [2], amount = 3
Output: -1
Example 3:

Input: coins = [1], amount = 0
Output: 0
 

Constraints:

1 <= coins.length <= 12
1 <= coins[i] <= 231 - 1
0 <= amount <= 104
 */


public class 404_Coin_Change_Using_DP{
static int solve(int coins[],int amount){
       int dp[]=new int[amount+1];
       for(int i=0;i<=amount;i++){
           dp[i]=Integer.MAX_VALUE;
       }
         dp[0]=0;
    
    for(int coin:coins){
        for(int i=coin;i<=amount;i++){
            if(dp[i-coin]!=Integer.MAX_VALUE){
                  dp[i]=Math.min(dp[i],dp[i-coin]+1);
            }
        }
    }

return dp[amount]==Integer.MAX_VALUE ? -1 : dp[amount];

}    

    public static void main(String[] args) {
        int coins[] = {1,2,5}, amount = 11;
       System.out.print(solve(coins,amount));
    }
}
