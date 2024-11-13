import java.util.*;
public class raj{
static int solverec(int coins[],int x){
       if(x==0)
       {
        return 0;
       }
    if(x<0)
    {
        return Integer.MAX_VALUE;
    }
int mini=Integer.MAX_VALUE;
 for(int i=0;i<coins.length;i++)
 {
      int ans=solverec(coins,x-coins[i]);
      if(ans!=Integer.MAX_VALUE)
      {
          mini=Math.min(mini,1+ans);
      }
 }
 return mini;
}
public static void main(String[]args){
    int coins[]={1,2,5};
    int x=11;
  System.out.print(solverec(coins,x));
  
}
}