import java.util.*;
public class raj{
static int  solve(String str1,String str2,int i,int j)
{
        if(i==str1.length())
        {
            return 0;
        }
        if(j==str2.length())
        {
            return 0;
        }
      int ans=0;
    if(str1.charAt(i)==str2.charAt(j))
    {
        ans=1+solve(str1,str2,i+1,j+1);
    }else{
        ans=Math.max(solve(str1,str2,i+1,j),solve(str1,str2,i,j+1));
    }

    return ans;
}
public static void main(String[]args){
String a="abc";
String b="abc";
System.out.print(solve(a,b,0,0)); 

}
}