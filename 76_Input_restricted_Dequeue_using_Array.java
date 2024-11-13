import java.util.*;
public class raj{
public static class queue{
      int arr[];
      int front,rear;
      int size;
      queue(int size)
      {
         front=rear=-1;
         this.size=size;
         arr=new int[size];
      }
}
static void enqueue(queue q,int data)
{
       if(q.rear==q.size-1)
       {
          System.out.print("Queue is Full");
       }else{
         q.rear++;
        q.arr[q.rear]=data;
       }
}
static int dequeue(queue q)
{
    int a=-1;
      if(q.front==q.front)
      {
        System.out.println("Queue is empty");
      }else{
         q.rear++;
         q.front++;
        a=q.arr[q.rear];
        a=q.arr[q.front];
      }
      return a;
      
}
public static void main(String[]args){
     queue q=new queue(4);
     enqueue(q,10);
     enqueue(q,20);
     enqueue(q,30);
     enqueue(q,40);
      //dequeue(q);
     System.out.println(dequeue(q));
     //System.out.println(dequeue(q));

}
}