import java.util.*;    //palindrom: 121=reverse 121 same//
public class palindrom{
 static boolean palindrom(int arr[],int n)
{
     int i=0;
      n=n-1;
     while(i<n)
     {
         if(arr[i]!=arr[n])
         {
             return false;
         }
         else if(arr[i]==arr[n])
         {
            return true;
         }
     }
     return true;
}
public static void main(String[]args){
    int arr[]={1,2,1,1,2,1};
    int n=6;
if(palindrom(arr,n))
{
    System.out.println("Pallindrom");
}else{
    System.out.println("Not Pallindrom");
}

}
}