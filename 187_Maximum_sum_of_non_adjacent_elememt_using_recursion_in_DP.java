import java.util.*;
public class raj{
static int solverec(int arr[],int n)
{
       if(n<0)
       {
         return 0;
       }
       if(n==0)
       {
        return arr[0];
       }
    int incl=solverec(arr,n-2)+arr[n];
    int excl=solverec(arr,n-1)+0;

    return Math.max(incl,excl);
}
public static void main(String[]args){
    int arr[]={9,9,8,2};
    int n=4;
    System.out.print(solverec(arr,n-1));

}
}