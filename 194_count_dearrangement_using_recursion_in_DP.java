import java.util.*;
public class raj{
static long  solve(int arr[],int n)
{
    long mod=1000000007;
     if(n==1)
     {
        return 0;
     }
     if(n==2)
     {
        return 1;
     }
   long ans=(((n-1)%mod)*((solve(arr,n-1)%mod)+(solve(arr,n-2)%mod)))%mod;
    return ans;
}
public static void main(String[]args){
    int arr[]={4,1,3};
    int n=3;
    System.out.print(solve(arr,n));

}
}