import java.util.*;
public class invers{
 static void riverse(int arr[],int n)
 {
    for(int i=n-1;i>=0;i--)
    {
        System.out.print(arr[i]+" ");
    }
 }
public static void main(String[]args){
    int arr[]={10,20,30,40,50};
    riverse(arr,5);

}
}