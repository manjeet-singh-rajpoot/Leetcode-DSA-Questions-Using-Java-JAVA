import java.util.*;
public class raj{
static int solve(int arr[],int n)
{
   int currrow[]=new int[n+1];
   int next[]=new int[n+1];
   
    for(int curr=n-1;curr>=0;curr--){
       for(int prev=curr-1;prev>=-1;prev--)
        {
        int include=0;
         if(prev==-1 || arr[curr]>arr[prev])
       {
        include=1+next[curr+1];
        }
       int exclude=0+next[prev+1];
        
      currrow[prev+1]=Math.max(include,exclude);
    }
    next=currrow;
}
   return next[0];
}
public static void main(String[]args){
    int arr[]={0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};
    int n=arr.length;

    System.out.print(solve(arr,n));

}
}
