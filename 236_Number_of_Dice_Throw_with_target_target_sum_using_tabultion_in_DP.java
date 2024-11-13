import java.util.*;
public class raj{
static int solve(int d,int f,int t)
{
      int dp[][]=new int[d+1][t+1];
     
       
      dp[0][0]=1;

      for(int dice=1;dice<=d;dice++)
      {
         for(int target=1;target<=t;target++)
         {
              int ans=0;
            for(int i=1;i<=f;i++)
            {
                 if(target-i>=0)
                 {
                    ans=ans+dp[dice-1][target-i];
                 }
            }
            dp[dice][target]=ans;
         }
      }
      return dp[d][t];
}
public static void main(String[]args){
    int n=3,m=6,x=12;
    System.out.print(solve(n,m,x));

}
}