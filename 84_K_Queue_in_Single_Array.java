import java.util.*;
public class array{
public static class queue{
    int arr[];
    int next[];
    int front[];
    int rear[];
    int free;
    int k;
    int n;
    queue(int k,int n)
    {
        this.k=k;
        this.n=n;
      free=0;
      next=new int[n];
      front=new int[k];
      rear=new int[k];
      arr=new int[n];
     for(int i=0;i<k;i++)
     {
        front[i]=-1;
        rear[i]=-1;
     }
     for(int i=0;i<n;i++)
     {
        next[i]=i+1;
     }
      next[n-1]=-1;
    }

boolean isEmpty(int qn)
{
    return front[qn]==-1;
}
 void enqueue(int data,int qn)
{
      if(free==-1)
      {
        System.out.print("Overflow..");
      }
      //enter first index//
      int index=next[free];
      arr[free]=data;
     if(isEmpty(qn))
     {
        front[qn]=free;
        rear[qn]=free;
     }else{
         next[rear[qn]]=free;
         rear[qn]=free;
     }
     next[free]=-1;
     free=index;
}
 int dequeue(int qn)
{
    if(isEmpty(qn))
    {
        System.out.print("Underflow..");
    }
        int space=front[qn];
        front[qn]=next[space];
        next[space]=free;
        free=space;
        return arr[space];
}
}
public static void main(String[]args){
    queue q=new queue(3,9);
     q.enqueue(10,0);
     q.enqueue(20,0);
     q.enqueue(30,0);

     q.enqueue(40,1);
     q.enqueue(50,1);
     q.enqueue(60,1);

     q.enqueue(70,2);
     q.enqueue(80,2);
     q.enqueue(90,2);

     System.out.println("dequeu 1 "+q.dequeue(0));
     System.out.println("dequeu 2 "+q.dequeue(1));
     System.out.println("dequeu 3 "+q.dequeue(2));

}
}