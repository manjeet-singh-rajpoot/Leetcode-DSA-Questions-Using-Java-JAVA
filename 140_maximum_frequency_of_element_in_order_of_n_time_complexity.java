import java.util.*;
public class raj{
    static int highfrequency(int arr[],int n)
    {
        int count=1;
        int res=0;
        for(int i=1;i<n;i++)
        {
              if(arr[i]==arr[res])
              {
                  count++;
              }else{
                count--;
              }
            if(count==0)
            {
                res=i;
                count=1;
            }
           
        }
        return arr[res];
    }
public static void main(String[]args){
    int arr[]={10,20,30,10,10};
    int n=arr.length;
   int count=0;
    int freq=highfrequency(arr,n);
    for(int i=0;i<n;i++)
    {
        if(arr[i]==freq)
        {
            count++;
        }
    }
System.out.print("max frequency "+highfrequency(arr,n)+" occurs "+count+" times");
}
}