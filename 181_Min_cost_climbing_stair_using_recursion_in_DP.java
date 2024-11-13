import java.util.*;
public class raj{
static int solve(int cost[],int n)
{
      if(n==0)
      return cost[0];
      if(n==1)
      return cost[1];

      int ans=cost[n]+Math.min(solve(cost,n-1),solve(cost,n-2));

      return ans;
}
static int mincost(int cost[],int n)
{
       int ans=Math.min(solve(cost,n-1),solve(cost,n-2));
       return ans;
}
public static void main(String[]args){
    int cost[]={10,15,20};
    int n=cost.length;
    System.out.print(mincost(cost,n));

}
}