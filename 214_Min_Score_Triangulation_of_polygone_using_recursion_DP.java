import java.util.*;
public class raj{
static int solve(int arr[],int i,int j)
{
      if(i+1==j)
      {
         return 0;
      }  
    int ans=Integer.MAX_VALUE;
    for(int k=i+1;k<j;k++)
    {
        ans=Math.min(ans,arr[i]*arr[j]*arr[k]+solve(arr,i,k)+solve(arr,k,j));
    }
 return ans;
}
public static void main(String[]args){
    int arr[]={1,2,3};
    int n=arr.length;
    
    System.out.print(solve(arr,0,n-1));

}
}