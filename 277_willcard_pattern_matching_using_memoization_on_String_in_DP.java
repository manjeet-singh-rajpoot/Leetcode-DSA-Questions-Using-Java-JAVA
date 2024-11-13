import java.util.*;
public class raj{
static boolean solve(String str,String p,int i,int j)
{
   boolean dp[][]=new boolean[str.length()+1][p.length()+1];

   for(int l=0;l<=str.length();l++)
   {
      for(int m=0;m<=p.length();m++)
      {
        dp[l][m]=false;
      }
   }
      if(i<0 && j<0)
      {
        return true;
      }
      if(i>=0 && j<0)
      {
          return false;
      }
      if(i<0 && j>=0)
      {
         for(int k=0;k<j;k++)
         {
            if(p.charAt(k)!='*')
            {
                return false;
            }
         }
         return true;
      }
    if(dp[i][j]!=false)
    {
        return dp[i][j];
    }
   
    //match//

    if(str.charAt(i)==p.charAt(j) || p.charAt(j)=='?')
    {
        return dp[i][j]=solve(str, p, i-1, j-1);
    }
    else if(p.charAt(j)=='*')
    {
         return dp[i][j]=(solve(str, p, i-1, j) || solve(str, p, i, j-1));
    }
    else{
        return dp[i][j]=false;
    }
}
public static void main(String[]args){
   String str="abcde";
   String p="a*c?e";
   System.out.print(solve(str,p,str.length()-1,p.length()-1)); 

}
}