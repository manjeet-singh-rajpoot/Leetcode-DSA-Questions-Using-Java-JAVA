import java.util.*;
public class circulardoubly{
  public static class Node{
     Node prev;
     int data;
     Node next;
    
    Node(int data)
    {
         this.data=data;
         this.prev=null;
         this.next=null;
    }
  }

  static void display(Node head)
{
     Node p=head;
    do{
         System.out.print(head.data+" ");
         head=head.next;
    }while(p!=head);
}

static Node deleteatfirst(Node head)
{
      Node p=head;
      Node q=head.next;
      Node r=head.prev;

      head=head.next;
      r.next=q;
      q.prev=r;
      head=q;
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

static Node deleteatend(Node head)
{
    Node p=head;
    Node q=head.next;
    while(q.next!=head)
    {
         p=p.next;
         q=q.next;
    }
    p.next=head;
    head.prev=p;
    q=null;
    return head;
}
public static void main(String[]args){
    Node head=new Node(20);
    Node second=new Node(30);
    Node third=new Node(40);
    Node fourth=new Node(50);
    Node five=new Node(60);

    head.prev=five;
    head.next=second;
   
    second.prev=head;
    second.next=third;

    third.prev=second;
    third.next=fourth;

    fourth.prev=third;
    fourth.next=five;

    five.prev=fourth;
    five.next=head;

System.out.println("Before first: ");
     display(head);

     System.out.println();
     System.out.println("after delete first: ");
     head=deleteatfirst(head);
     display(head);

     System.out.println();
     System.out.println("after delete index: ");
     head=deleteatindex(head,2);
     display(head);

     System.out.println();
     System.out.println("after delete end : ");
     head=deleteatend(head);
     display(head);
}
}