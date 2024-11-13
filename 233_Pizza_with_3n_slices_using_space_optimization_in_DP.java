import java.util.*;
public class raj{
static int solve(int arr[])
{
     int k=arr.length;
   
     int prev1[]=new int[k+2];
     int curr1[]=new int[k+2];
     int next1[]=new int[k+2];

     int prev2[]=new int[k+2];
     int curr2[]=new int[k+2];
     int next2[]=new int[k+2];

     for(int index=k-2;index>=0;index--)
     {
        for(int n=1;n<=k/3;n++)
        {
             int include=arr[index]+next1[n-1];
             int exclude=0+curr1[n];
             prev1[n]=Math.max(include,exclude);
        }
        next1=curr1;
        curr1=prev1;
     }
       int case1=curr1[k/3];
    
       for(int index=k-1;index>=1 ;index--)
       {
          for(int n=1;n<=k/3;n++)
          {
               int include=arr[index]+next2[n-1];
               int exclude=0+curr2[n];
               prev2[n]=Math.max(include,exclude);
          }
          next2=curr2;
          curr2=prev2;
       }
        int case2=curr2[k/3];
     return Math.max(case1,case2);
}
static int maxsize(int arr[])
{
   return solve(arr);
}
public static void main(String[]args){
    int slices[]={1,2,3,4,5,6};
    System.out.print(maxsize(slices));

}
}