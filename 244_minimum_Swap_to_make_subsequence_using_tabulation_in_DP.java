import java.util.*;
public class raj{
static int solve(int num1[],int num2[])
{
    int n=num1.length;
    int dp[][]=new int[n+1][2];

    for(int index=n-1;index>=1;index--)
    {
          for(int swapped=1;swapped>=0;swapped--)
          {
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
                  ans=dp[index+1][0];
             }
            //swap
             if(num1[index]>prev2 && num2[index]>prev1)
             {
                 ans=Math.min(ans,1+dp[index+1][1]);
             }
            dp[index][swapped]=ans;
          }
    }
    return dp[1][0];
}

public static void main(String[]args){
    int num1[]={1,3,5,4};
    int num2[]={1,2,3,7};

    System.out.print(solve(num1,num2));

}
}
