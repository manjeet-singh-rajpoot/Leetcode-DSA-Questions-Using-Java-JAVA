import java.util.*;
public class raj{
static boolean solve(String str,String p)
{
      //mistack//
    
   boolean curr[]=new boolean[p.length()+1];
   boolean prev[]=new boolean[p.length()+1];
   
   prev[0]=true;

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
      prev[j]=true;
    }

    for(int i=1;i<=str.length();i++)
    {
        for(int j=1;j<=p.length();j++)
        {
            if(str.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?')
            {
               curr[j]=prev[j-1];
            }
            else if(p.charAt(j-1)=='*')
            {
                curr[j]=(prev[j] || curr[j-1]);
            }
            else{
              curr[j]=false;
            }
        }
        prev=curr;
    }

return prev[p.length()];
}
public static void main(String[]args){
   String str="abcde";
   String p="abcde";
   System.out.print(solve(str,p)); 

}
}