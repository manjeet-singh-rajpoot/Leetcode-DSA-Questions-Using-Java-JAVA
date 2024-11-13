import java.util.*;
public class raj{
static int solve(String str1,String str2)
{
    int dp[][]=new int[str1.length()+1][str2.length()+1];

      for(int j=0;j<=str2.length();j++)
      {
          dp[str1.length()][j]=str2.length()-j;
      }
       
      for(int i=0;i<=str1.length();i++)
      {
          dp[i][str2.length()]=str1.length()-i;
      }
    
      for(int i=str1.length()-1;i>=0;i--)
      {
        for(int j=str2.length()-1;j>=0;j--)
        {
            int ans=0;
            if(str1.charAt(i)==str2.charAt(j)){
              ans=dp[i+1][j+1];
            }else{
             int insert=1+dp[i][j+1];
             int delete=1+dp[i+1][j];
             int replace=1+dp[i+1][j+1];
     
             ans=Math.min(insert,Math.min(delete,replace));
            }
         dp[i][j]=ans;
        }
      }
    return  dp[0][0];
}
public static void main(String[]args){
String str1="horse";
String str2="ros";
System.out.print(solve(str1,str2));

}
}