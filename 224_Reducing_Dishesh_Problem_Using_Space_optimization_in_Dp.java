import java.util.*;
public class raj{
static int solve(int arr[])
{
     //Small mistack//
    int n=arr.length;
    int curr[]=new int[n+1];
    int next[]=new int[n+1];
     for(int index=n-1;index>=0;index--)
     {
      for(int time=index;time>=0;time--)
        {
         int include=arr[index]*(time+1)+next[time+1];
         int exclude=0+next[time];

          curr[time]=Math.max(include,exclude);
        }
     next=curr;
    }
   return next[0];
}
static void bubblesort(int arr[])
{
      for(int i=0;i<arr.length;i++)
      {
          for(int j=i+1;j<arr.length-i-1;j++)
          {
              if(arr[i]>arr[j])
              {
                  int temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
              }
          }
      }
}
public static void main(String[]args){
    int satisfaction[]={-1,-8,0,5,-9};
    bubblesort(satisfaction);
    System.out.print(solve(satisfaction));

}
}