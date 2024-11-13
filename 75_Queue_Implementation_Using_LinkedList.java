import java.util.*;
public class uniun{
public static class Node{
    int data;
    Node next;
  Node(int data)
  {
        this.data=data;
        this.next=null;
  }
}
public static class queue{
 Node rear,front;
 public queue()
  {
     this.rear=null;
     this.front=null;
  }
 void enqueue(int data)
{
      Node temp=new Node(data);
      if(rear==null)
      {
        front=rear=temp;
        return;
      }
      rear.next=temp;
      rear=temp;
}
 void dequeue()
{
   if(front==null)
   {
      return;
   }
   Node temp=front;
   front=front.next;
   if(front==null)
   {
      rear=null;
   }
}
}
public static void main(String[]args){
   queue q = new queue();
     q.enqueue(10);
     q.enqueue(20);
     q.enqueue(30);
     q.enqueue(40);
     q.enqueue(50);
   
     
     q.dequeue();
    System.out.println("queue front : "+(q.front)!=null ? (q.front).data:-1);


}
}
