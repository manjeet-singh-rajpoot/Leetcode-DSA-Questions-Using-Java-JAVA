import java.util.*;          //Move_To_Zeros //
public class move {
    static void display(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
static int move(int arr[],int n)
{
    int i=0;
    int temp=0;
    for(int j=0;j<5;j++)
    {
          if(arr[j]!=0)
          {
              temp=arr[j];
              arr[j]=arr[i];
              arr[i]=temp;
              i++;
          }
    }
    return 0;
}
public static void main(String[]args){
    int arr[]={0,10,20,0,0,};
    move(arr,5);
    display(arr,5);

}
}