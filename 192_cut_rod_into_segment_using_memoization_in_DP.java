import java.util.*;
public class raj{
static int solve(int n,int x,int y,int z)
{

      if(n==0)
      {
        return 0;
      }
int a=0;
int b=0;
int c=0;

if(x<=n)
{
   a=solve(n-x,x,y,z);
}
if(y<=n){
 b=solve(n-y,x,y,z);
}
 if(z<=n){
  c=solve(n-z,x,y,z);
 }

int ans=1+Math.max(a,Math.max(b,c));


 return ans;
}
public static void main(String[]args){
    int l1 = 11, p1 = 2, q1 = 3, r1 = 5;
    int l2 = 7, p2 = 2, q2 = 5, r2 = 5;

    // Output the result for each case
    System.out.println(solve(l1, p1, q1, r1)); // Output: 5
    System.out.println(solve(l2, p2, q2, r2)); // Output: 2

}
}