import java.util.*;
public class raj{
static int solvetab(int []arr)
{
   
     int n=arr.length;
    int prev1=arr[0];
    int prev2=0;
for(int i=1;i<n;i++)
{
      int incl=prev2+arr[i];
      int excl=prev1+0;
     int ans=Math.max(incl,excl);
     prev2=prev1;
     prev1=ans;
}
return prev1;
}
static int houserobber(int arr[])
{
    int n=arr.length;
    if(n==1)
    {
        return arr[0];
    }
 int arr1[]=new int[n+1];
 int arr2[]=new int[n+1];
 for(int i=0;i<n;i++)
 {
    if(i!=n-1)
    {
        arr1[i]=arr[i];
    }
    if(i!=0)
    {
        arr2[i]=arr[i];
    }
 }

 return Math.max(solvetab(arr1),solvetab(arr2));
}
public static void main(String[]args){
    int arr[]={9,9,8,2};
    int n=arr.length;
    System.out.print(houserobber(arr));

}
}