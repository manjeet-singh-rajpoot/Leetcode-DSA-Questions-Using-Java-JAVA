import java.util.*;
public class raj{
static int solve(int arr[])
{
    int n=arr.length;
    int curr[]=new int[2];
    int next[]=new int[2];
    
    for(int index=n-1;index>=0;index--)
    {
         for(int buy=0;buy<=1;buy++)
         {
             int profit=0;
            if(buy==1)
            {
                int buykaro=-arr[index]+next[0];
                int skip=0+next[1];
                profit=Math.max(buykaro,skip);
            }else{
                int sellkaro=+arr[index]+next[1];
                int skip=0+next[0];
                profit=Math.max(sellkaro,skip);
            }
            curr[buy]=profit;
         }
         next=curr;
    }
    return next[1];
}
public static void main(String[]args){
    int arr[]={7,1,5,3,6,4};
    int n=arr.length;
    System.out.print(solve(arr));


}
}