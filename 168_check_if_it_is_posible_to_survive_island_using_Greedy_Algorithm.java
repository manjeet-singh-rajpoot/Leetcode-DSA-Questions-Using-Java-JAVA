import java.util.*;
public class  raj{
static int posible(int s,int m,int n)
{
       int sunday=s/7;
       int buyday=s-sunday;
       int totalday=m*s;
       int ans=0;
    if(totalday%n==0)
    {
        ans=totalday+n;
    }else{
        ans=totalday/n+1;
    }

    if(ans<=buyday)
    {
       System.out.print("Survive to minday: "+ans);
    }else
    System.out.print("not Survive to minday");
    return -1;
}
public static void main(String[]args){
 int s=10,m=2,n=16;
 posible(s,m,n);
  
}
}