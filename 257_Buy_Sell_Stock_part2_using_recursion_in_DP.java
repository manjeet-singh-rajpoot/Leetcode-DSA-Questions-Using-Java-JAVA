import java.util.*;
public class raj{
static int solve(int arr[],int index,int buy)
{
       if(index==arr.length)
       {
        return 0;
       }
     int profit=0;

     if(buy==1)
     {
        int buykaro=-arr[index]+solve(arr,index+1,0);
        int skip=0+solve(arr,index+1,1);
        profit=Math.max(buykaro,skip);
     }else{
        int sellkaro=+arr[index]+solve(arr,index+1,1);
        int skip=0+solve(arr,index+1,0);
        profit=Math.max(sellkaro,skip);
     }

     return profit;
}
public static void main(String[]args){
    int arr[]={7,1,5,3,6,4};
    int n=arr.length;
    System.out.print(solve(arr,0,1));

}
}