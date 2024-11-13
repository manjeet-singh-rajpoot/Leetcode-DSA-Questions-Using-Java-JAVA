import java.util.*;
public class raj{
static int mod=1000000007;
static int add(int a,int b)
{
    return ((a%mod)+b%mod)%mod;
}
static int multi(int a,int b)
{
    return ((a%mod)*b%mod)%mod;
}
static int solve(int n,int k)
{
  
     if(n==1)
     {
        return k;
     }
     if(n==2)
     {
         return add(k,multi(k,(k-1)));
     }
   
    int ans=add(multi(solve(n-2,k),k-1),multi(solve(n-1,k),k-1));
  
     return ans;
}
public static void main(String[]args){
    int n=3,k=2;
    System.out.print(solve(n,k));
}
}
