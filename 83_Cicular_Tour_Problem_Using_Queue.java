import java.util.*;
public class circular{
static int tour(int pump[],int distance[],int n)
{
        int front=0;
        int balance=0;
        int rear=0;
    for(int i=0;i<n;i++)
    {
         balance+=pump[i]-distance[i];
         if(balance<0)
         {
             front+=balance;
            rear++;
           balance=0;
         }
    }
    if(front+balance>=0)
    {
          return rear;
    }else
    return -1;
}
public static void main(String[]args){
   int pump[]={4,6,7,4};
   int distance[]={6,5,3,5};
   int n=4;
   System.out.print(tour(pump,distance,n));    

}
}