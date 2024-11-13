import java.util.*;
public class raj{
static int solvetab(int []arr,int n)
{
   
    int dp[]=new int[n+1];
    Arrays.fill(dp,0);
      
     dp[0]=arr[0];

for(int i=2;i<n;i++)
{
      int incl=dp[i-2]+arr[i];
      int excl=dp[i-1]+0;
      dp[i]=Math.max(incl,excl);
}

return dp[n-1];
}

public static void main(String[]args){
    int arr[]={9,9,8,2};
    int n=arr.length;
    System.out.print(solvetab(arr,n-1));

}
}