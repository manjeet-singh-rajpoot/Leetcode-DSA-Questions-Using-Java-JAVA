import java.util.*;
public class doubly{
    public static class Node{
         int data;
         Node prev;
         Node next;
    Node(int data)
    {
         this.data=data;
         this.next=null;
         this.prev=null;
    }
}
static void display(Node head)
{
       while(head!=null)
       {
        System.out.print(head.data+" ");
        head=head.next;
       }
}

static Node deleteatfirst(Node head)
{
     Node p=head;
     head=head.next;
     head.prev=null;
     p=null;
     return head;
    
}
  
static Node deleteatindex(Node head,int index)
{
       Node p=head;
       Node q=head.next;
       Node r=q.next;
       int i=0;
      while(i!=index-1)
      {
        p=p.next;
        q=q.next;
        r=r.next;
        i++;
      }
     p.next=r;
     r.prev=p;
     q=null;
     return head;
}
static Node deleteend(Node head)
{
     Node p=head;
     Node q=head.next;
     while(q.next!=null)
     {
         p=p.next;
         q=q.next;
     }
  p.next=null;
  q.next=null;
return head;
}
public static void main(String[]args){
    
    Node head=new Node(20);
    Node second=new Node(30);
    Node third=new Node(40);
    Node fourth=new Node(50);
    Node five=new Node(60);
    Node six=new Node(70);

    head.prev=null;
    head.next=second;
   
    second.prev=head;
    second.next=third;

    third.prev=second;
    third.next=fourth;

    fourth.prev=third;
    fourth.next=five;

    five.prev=fourth;
    five.next=six;

    six.prev=five;
    six.next=null;


System.out.println("Before first: ");
    display(head);
   
    System.out.println();
    System.out.println("after first: ");
    head=deleteatfirst(head);
    display(head);

    System.out.println();
    System.out.println("after indexing: ");
    head=deleteatindex(head,1);
    display(head);

    System.out.println();
    System.out.println("after end: ");
    head=deleteend(head);
    display(head);
    
}
}