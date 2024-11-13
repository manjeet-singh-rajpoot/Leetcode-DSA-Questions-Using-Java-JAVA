import java.util.*;
public class raj{
static int solve(int arr[],int n)
{
     int mini=arr[0];
     int profit=0;
    
    for(int i=1;i<n;i++)
    {
        int diff=arr[i]-mini;
        profit=Math.max(profit,diff);

        mini=Math.min(mini,arr[i]);
    }

    return profit;
}
public static void main(String[]args){
    int arr[]={7,1,5,3,6,4};
    int n=arr.length;
    System.out.print(solve(arr,n));
}
}