import java.util.*;
public class raj{
static int tabulation(int coins[],int x)
{
    int table[]=new int[x+1];
    //yadi x =0 ho
    table[0]=0;
   for(int i=1;i<=x;i++)
   {
         table[i]=Integer.MAX_VALUE;
   }
    int mini=Integer.MAX_VALUE;
    for(int i=1;i<=x;i++)
    {
        for(int j=0;j<coins.length;j++){
         if(coins[j]<=i)
         {
             int ans=table[i-coins[j]];
             if(ans!=Integer.MAX_VALUE && ans+1<table[i])
             {
                table[i]=1+ans;
             }
         }
    }
}

    if(table[x]==Integer.MAX_VALUE)
    {
        return -1;
    }
    return table[x];
}
public static void main(String[]args){
    int coins[]={1,2,5};
    int x=11;
  System.out.print(tabulation(coins,x));

}
}