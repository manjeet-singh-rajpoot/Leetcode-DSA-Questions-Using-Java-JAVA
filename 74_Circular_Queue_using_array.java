import java.util.*;
public class  circular{
public static class queue{
    int size;
    int f,r;
    int arr[];
queue(int size)
{
    f=r=0;
    this.size=size;
    arr=new int[size];
}
}
static boolean isempty(queue q)
{
     if(q.f==q.r)
     {
        return true;
     }else{
        return false;
     }
}
static boolean isfull(queue q)
{
    if((q.r+1)%q.size==q.f)
{
    return true;
}else{
    return false;
}
}
static void enqueue(queue q,int data)
{
     if(isfull(q))
     {
        System.out.println("full");
     }else{
        q.r=(q.r+1)%q.size;
        q.arr[q.r]=data;
     }
}
static int dequeue(queue q)
{
    int a=-1;
      if(isempty(q))
      {
        System.out.println("Empty");
      }else{
        q.f=(q.f+1)%q.size;
        a=q.arr[q.f];
      }
      return a;
}
public static void main(String[]args){
    queue q=new queue(3);
     enqueue(q,10);
     enqueue(q,20);
     enqueue(q,30);

   System.out.println(dequeue(q));
   System.out.println(dequeue(q));
 //  System.out.println(dequeue(q));

}
}