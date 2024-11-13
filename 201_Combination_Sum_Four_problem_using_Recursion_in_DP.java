import java.util.*;
public class raj{
static int solve(int arr[],int target)
{
   if(target==0)
   {
   return 1;
   }
   if(target<0)
   {
    return 0;
   }
  int ans=0;
 for(int i=0;i<arr.length;i++)
 {
     ans=ans+solve(arr,target-arr[i]);
 }
 return ans;
}
public static void main(String[]args){
    int arr[]={1,2,5};
    int target=5;
    System.out.print(solve(arr,target));

}
}