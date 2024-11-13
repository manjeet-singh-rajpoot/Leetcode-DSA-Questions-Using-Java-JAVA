import java.util.*;
public class raj{
static int  solve(String str1,String str2)
{
    int n1=str1.length();
    int n2=str2.length();
    int dp[][]=new int[n1+1][n2+1];
   
     for(int i=str1.length()-1;i>=0;i--)
     {
        for(int j=str2.length()-1;j>=0;j--)
        {
            int ans=0;
            if(str1.charAt(i)==str2.charAt(j))
            {
                ans=1+dp[i+1][j+1];
            }else{
                ans=Math.max(dp[i+1][j],dp[i][j+1]);
            }
           dp[i][j]=ans;
        }
     }
    return dp[0][0];
}
public static void main(String[]args){
String a="abc";
String b="abc";
System.out.print(solve(a,b)); 

}
}