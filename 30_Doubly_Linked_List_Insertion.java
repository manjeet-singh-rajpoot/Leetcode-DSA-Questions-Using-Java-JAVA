import java.util.*;
public class doubly{
  public static class Node{
       int data;
       Node next;
       Node prev;
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

static Node insertatfirst(Node head,int data)
{
      Node ptr=new Node(data);
      ptr.prev=null;
      ptr.next=head;
      head=head.next;
      head=ptr;
      return head;
}

static Node insertatgivenindex(Node head,int index,int data)
{
      Node ptr=new Node(data);
    Node p=head;
    Node q=head.next;
    int i=0;
    while(i!=index-1)
    {
        p=p.next;
        q=q.next;
        i++;
    }
   ptr.next=p.next;
   q.prev=ptr;
   p.next=ptr;
   ptr.prev=p;

   return head;
}

static Node insertatend(Node head,int data)
{
     Node ptr=new Node(data);
     Node p=head;
    
     while(p.next!=null)
     {
           p=p.next;
     }
    p.next=ptr;
    ptr.prev=p;
    ptr.next=null;
    return head;
}

static int counta(Node head)
{
      int count=0;
      while(head!=null)
      {
          count++;
          head=head.next;
      }
      return count;
}

static void riverse(Node head)
{
       if(head==null)
       {
        return ;
       }
       riverse(head.next);
       System.out.print(head.data+" ");
}
public static void main(String[]args){
    Node head=new Node(20);
    Node second=new Node(30);
    Node third=new Node(40);

    head.prev=null;
    head.next=second;
   
    second.prev=head;
    second.next=third;

    third.prev=second;
    third.next=null;
System.out.println("Before first: ");
    display(head);
   
    System.out.println();
    System.out.println("after first: ");
    head=insertatfirst(head,10);
    display(head);

    System.out.println();
    System.out.println("after givenindex");
    head=insertatgivenindex(head,2,50);
    display(head);

    System.out.println();
    System.out.println("after end");
    head=insertatend(head,60);
    display(head);

    System.out.println();
    System.out.println("Counting Node: "+counta(head));

    System.out.println("riverse: ");
    //System.out.println();
   // System.out.println("after end");
    head=insertatend(head,80);
   riverse(head);
}
}