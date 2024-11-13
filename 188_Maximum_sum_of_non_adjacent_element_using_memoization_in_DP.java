import java.util.*;
public class raj{
static int solvemem(int arr[],int n)
{
       int dp[]=new int[n+1];
       Arrays.fill(dp,-1);

       if(n<0)
       {
        return 0;
       }
       if(n==0)
       {
        return arr[0];
       }
       if(dp[n]!=-1)
       {
        return dp[n];
       }

       int incl=solvemem(arr, n-2)+arr[n];
       int excl=solvemem(arr,n-1)+0;

       dp[n]=Math.max(incl,excl);

       return dp[n];
}
public static void main(String[]args){
    int arr[]={9,9,8,2};
    int n=4;
System.out.print(solvemem(arr,n-1));

}
}