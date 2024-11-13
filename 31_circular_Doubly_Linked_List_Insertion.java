import java.util.*;
public class  cicular{
  public static class Node{
    int data;
    Node prev;
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

static Node insertatfirst(Node head,int data)
{
       Node ptr=new Node(data);
       Node q=head.prev;
       q.next=ptr;
       ptr.prev=q;
       ptr.next=head;
       head.prev=ptr;
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
    while(p.next!=head)
    {
        p=p.next;
    }
    p.next=ptr;
    ptr.prev=p;
    ptr.next=head;
    head.prev=ptr;
    return head;
    
}

public static void main(String[]args){
    Node head=new Node(20);
    Node second=new Node(30);
    Node third=new Node(40);

    head.prev=third;
    head.next=second;
   
    second.prev=head;
    second.next=third;

    third.prev=second;
    third.next=head;

System.out.println("Before first: ");
     display(head);

     System.out.println();
     System.out.println("after first: ");
     head=insertatfirst(head,10);
     display(head);

     System.out.println();
     System.out.println("after givenindex: ");
     head=insertatgivenindex(head,3,60);
     display(head);

     System.out.println();
     System.out.println("after end: ");
     head=insertatend(head,70);
     display(head);
}
}