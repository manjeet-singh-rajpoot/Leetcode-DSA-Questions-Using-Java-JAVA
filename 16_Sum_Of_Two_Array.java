import java.util.*;
public class sum {
static int sum(int arr1[],int arr2[],int n,int m)
{
    int sum[]=new int[n>m?n:m];
    int i=n-1;
    int j=m-1;
    int k=sum.length-1;
    int carry=0;
    while(k>=0)
    {
        int d=carry;
         if(i>=0)
         {
            d+=arr1[i];
         }
         if(j>=0)
         {
             d+=arr2[j];
         }
         carry=d/10;
         d=d%10;
         sum[k]=d;
         i--;
         j--;
         k--;
    }
    if(carry!=0)
    {
        System.out.print(carry);
    }
    for(int val:sum)
    {
         System.out.print(val);
    }
 return 0;
}
public static void main(String[]args){
    int arr1[]={10,20,30,40,50};
    int arr2[]={50,40};
    int n=5;
    int m=2;
  sum(arr1,arr2,n,m);
}
}