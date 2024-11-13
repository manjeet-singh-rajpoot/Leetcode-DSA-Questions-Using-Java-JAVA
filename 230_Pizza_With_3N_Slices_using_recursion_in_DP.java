import java.util.*;
public class raj{
static int solve(int arr[],int index,int endindex,int n)
{
      if(n==0 || index>endindex)
      {
        return 0;
      }
    int include=arr[index]+solve(arr,index+2,endindex,n-1);
    int exclude=0+solve(arr,index+1,endindex,n);

    return Math.max(include,exclude);
}
static int maxsize(int arr[])
{
    int k=arr.length;

    int case1=solve(arr,0,k-2,k/3);
    int case2=solve(arr,1,k-1,k/3);

    return Math.max(case1,case2);
}
public static void main(String[]args){
    int slices[]={1,2,3,4,5,6};
    System.out.print(maxsize(slices));

}
}