import java.util.*;
public class raj{
static int  solve(String str1,String str2,int i,int j)
{
    int n1=str1.length();
    int n2=str2.length();
    int dp[][]=new int[n1+1][n2+1];
    for(int l=0;l<=n1;l++)
    {
        for(int m=0;m<=n2;m++)
        {
            dp[l][m]=-1;
        }
    }
        if(i==str1.length())
        {
            return 0;
        }
        if(j==str2.length())
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
      int ans=0;
    if(str1.charAt(i)==str2.charAt(j))
    {
        ans=1+solve(str1,str2,i+1,j+1);
    }else{
        ans=Math.max(solve(str1,str2,i+1,j),solve(str1,str2,i,j+1));
    }
   dp[i][j]=ans;
    return dp[i][j];
}
public static void main(String[]args){
String a="abc";
String b="abc";
System.out.print(solve(a,b,0,0)); 

}
}