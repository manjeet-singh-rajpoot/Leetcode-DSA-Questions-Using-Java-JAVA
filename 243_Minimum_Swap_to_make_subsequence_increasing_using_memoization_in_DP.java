import java.util.*;
public class raj{
static int solve(int num1[],int num2[],int swapped,int index,int dp[][])
{
        if(index==num1.length)
        {
            return 0;
        }
        if(dp[index][swapped]!=-1)
        {
            return dp[index][swapped];
        }
   int prev1=num1[index-1];
   int prev2=num2[index-1];

   int ans=Integer.MAX_VALUE;
//catch swapp
    if(swapped==1)
    {
        int temp=prev1;
        prev1=prev2;
        prev2=temp;
    }
    //no swap
    if(num1[index]>prev1  && num2[index]>prev2)
    {
         ans=solve(num1,num2,0,index+1,dp);
    }
   //swap
    if(num1[index]>prev2 && num2[index]>prev1)
    {
        ans=Math.min(ans,1+solve(num1,num2,1,index+1,dp));
    }
   dp[index][swapped]=ans;
return dp[index][swapped];
}
static int solve1(int num1[],int num2[])
{
    num1[0]=-1;
    num2[0]=-1;

  int swapped=0;
  int n=num1.length;

  int dp[][]=new int[n+1][2];
  for(int i=0;i<n;i++)
  {
      for(int j=0;j<2;j++)
      {
         dp[i][j]=-1;
      }
  }
    return solve(num1,num2,swapped,1,dp);

}
public static void main(String[]args){
    int num1[]={1,3,5,4};
    int num2[]={1,2,3,7};

    System.out.print(solve1(num1,num2));

}
}
