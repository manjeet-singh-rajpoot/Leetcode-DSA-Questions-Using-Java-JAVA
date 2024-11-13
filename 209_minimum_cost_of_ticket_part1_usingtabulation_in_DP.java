import java.util.*;
public class raj{
static int solve(int n,int days[],int cost[])
{    
        int dp[]=new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        
        dp[n]=0;
        for(int k=n-1;k>=0;k--)
        {
            //for 1 days//
            int option1=cost[0]+dp[k+1];
         int i;
            for(i=k;i<n &&days[i]<days[k]+7;i++);

            int option2=cost[1]+dp[i];

            for(i=k;i<n && days[i]<days[k]+30;i++);

            int option3=cost[2]+dp[i];

            dp[k]=Math.min(option1,Math.min(option2,option3));
        }
return dp[0];
}
public static void main(String[]args){
int days[]={1,4,6,7,8,20};
int cost[]={2,7,15};
int n=days.length;
System.out.print(solve(n, days, cost));

}
}