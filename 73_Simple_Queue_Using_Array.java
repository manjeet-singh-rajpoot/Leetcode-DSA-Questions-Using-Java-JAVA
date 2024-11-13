import java.util.*;
public class raj{
public static class queue{
    int arr[];
    int f;
    int r;
    int size;
  queue(int size)
  {
       f=-1;
       r=-1;
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
    if(q.r==q.size-1)
    {
        return true;
    }else{
        return false;
    }
}
static void enQueue(queue q,int data)
{
    if(isfull(q))
    {
            System.out.println("overflow....");
    }else{
        q.r++;
        q.arr[q.r]=data;

    }
}
static int deQueue(queue q)
{
    int a=-1;
    if(isempty(q))
    {
        System.out.println("underflow....");
    }else{
    q.f++;
    a=q.arr[q.f];
    }
    return a;
}
static int peek(queue q)
{
    if(isempty(q))
    {
        System.out.println("empty");
    }
    return q.arr[q.f];
}
public static void main(String[]args){
    queue q=new queue(3);
    enQueue(q,10);
    enQueue(q,20);
    enQueue(q,30);
 // System.out.println(peek(q));
   System.out.println(deQueue(q));
   System.out.println(deQueue(q));
   System.out.println(deQueue(q));

}
}