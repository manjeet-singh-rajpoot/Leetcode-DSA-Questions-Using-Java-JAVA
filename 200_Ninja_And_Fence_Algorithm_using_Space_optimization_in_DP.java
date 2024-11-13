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
   int prev2=k;
   int prev1=add(k,multi(k,(k-1)));
   
  for(int i=3;i<=n;i++){
   int ans=add(multi(prev2,k-1),multi(prev1,k-1));
   prev2=prev1;
   prev1=ans;

}
     return prev1;
}
public static void main(String[]args){
    int n=3,k=2;
    System.out.print(solve(n,k));
}
}
