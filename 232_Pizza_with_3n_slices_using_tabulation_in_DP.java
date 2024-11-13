import java.util.*;
public class raj{
static int solve(int arr[])
{
     int k=arr.length;
   
     int dp1[][]=new int[k+2][k+2];
     int dp2[][]=new int[k+2][k+2];

     for(int index=k-2;index>=0;index--)
     {
        for(int n=1;n<=k/3;n++)
        {
             int include=arr[index]+dp1[index+2][n-1];
             int exclude=0+dp1[index+1][n];
            dp1[index][n]=Math.max(include,exclude);
        }
     }
       int case1=dp1[0][k/3];
    
     for(int index=k-1;index>=1;index--)
     {
         for(int n=1;n<=k/3;n++)
         {
             int include=arr[index]+dp2[index+2][n-1];
             int exclude=0+dp2[index+1][n];

             dp2[index][n]=Math.max(include,exclude);
         }
     }
     
     int case2=dp2[1][k/3];

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