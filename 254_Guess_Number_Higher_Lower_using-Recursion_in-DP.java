import java.util.*;
public class raj{
static int solve(int s,int e)
{
   if(s>=e)
   {
    return 0;
   }
  int ans=Integer.MAX_VALUE;

   for(int i=s;i<=e;i++)
   {
    ans=Math.min(ans,i+Math.max(solve(s,i-1),solve(i+1,e)));
   }

   return ans;
}

public static void main(String[]args){
   int n=10;
System.out.print(solve(1,n)); 
}
}