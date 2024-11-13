import java.util.*;
public class raj{
static boolean solve(String str,String p)
{
    boolean dp[][]=new boolean[str.length()+1][p.length()+1];
     
    dp[0][0]=true;

    for(int j=1;j<=p.length();j++)
    {
        boolean flag=true;
        for(int k=1;k<=j;k++)
        {
           if(p.charAt(k-1)!='*')
           {
              flag=false;
              break;
           }
        }
       dp[0][j]=true;
    }

    for(int i=1;i<=str.length();i++)
    {
        for(int j=1;j<=p.length();j++)
        {
            if(str.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?')
            {
               dp[i][j]=dp[i-1][j-1];
            }
            else if(p.charAt(j-1)=='*')
            {
                dp[i][j]=(dp[i-1][j] || dp[i][j-1]);
            }
            else{
               dp[i][j]=false;
            }
        }
    }

return dp[str.length()][p.length()];
}
public static void main(String[]args){
   String str="abcde";
   String p="a*c?e";
   System.out.print(solve(str,p)); 

}
}