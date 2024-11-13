import java.util.*;
public class raj{
static int solve(int arr[],int curr,int prev,int n)
{
       if(curr==n)
       {
        return 0;
       }
      //include //
      int include=0;
      int exclude=0;
    if(prev==-1 || arr[curr]>arr[prev])
    {
        include=1+solve(arr,curr+1,curr,n);
    }else{
        exclude=0+solve(arr,curr+1,prev,n);
    }
    return Math.max(include,exclude);
}
public static void main(String[]args){
    int arr[]={5,8,3,7,9,1};
    int n=arr.length;

    System.out.print(solve(arr,0,-1,n));

}
}