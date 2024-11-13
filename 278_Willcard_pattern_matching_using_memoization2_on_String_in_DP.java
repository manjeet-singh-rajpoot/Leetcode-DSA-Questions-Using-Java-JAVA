import java.util.*;
public class raj{
static boolean solve(String str,String p,int i,int j)
{
   boolean dp[][]=new boolean[str.length()+1][p.length()+1];

      if(i==0 && j==0)
      {
        return true;
      }
      if(i>=0 && j==0)
      {
          return false;
      }
      if(i==0 && j>=0)
      {
         for(int k=1;k<=j;k++)
         {
            if(p.charAt(k-1)!='*')
            {
                return false;
            }
         }
         return true;
      }
   
    //match//

    if(str.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?')
    {
        return dp[i][j]=solve(str, p, i-1, j-1);
    }
    else if(p.charAt(j-1)=='*')
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
   System.out.print(solve(str,p,str.length(),p.length())); 

}
}