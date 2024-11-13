import java.util.*;
public class raj{
static int solve(int dice,int faces,int target)
{
     if(target<0)
     {
         return 0;
     }
if(target==0 && dice==0)
{
    return 1;
}
if(target!=0 && dice==0)
{
    return 0;
}
if(target==0 &&dice!=0)
{
    return 0;
}
int ans=0;
   for(int i=1;i<=faces;i++)
   {
       ans=ans+solve(dice-1,faces,target-i);

   }

   return ans;

}

public static void main(String[]args){
    int n=3,m=6,x=12;
    System.out.print(solve(n,m,x));

}
}