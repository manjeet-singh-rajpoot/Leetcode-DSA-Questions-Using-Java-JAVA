import java.util.*;
public class raj{
static int  solve(String str1,String str2)
{
    int n1=str1.length();
    int n2=str2.length();
  int curr[]=new int[n2+1];
  int next[]=new int[n2+1];
   
     for(int i=str1.length()-1;i>=0;i--)
     {
        for(int j=str2.length()-1;j>=0;j--)
        {
            int ans=0;
            if(str1.charAt(i)==str2.charAt(j))
            {
                ans=1+next[j+1];
            }else{
                ans=Math.max(next[j],curr[j+1]);
            }
         curr[j]=ans;
        }
        next=curr;
     }
    return next[0];
}
public static void main(String[]args){
String a="abc";
String b="abc";
System.out.print(solve(a,b)); 

}
}