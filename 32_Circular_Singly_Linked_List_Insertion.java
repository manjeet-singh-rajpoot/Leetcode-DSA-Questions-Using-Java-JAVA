import java.util.*;
public class circular{
    public static class Node{
          int data;
          Node next;
        Node(int data)
        {
             this.data=data;
        }
    }

static void display(Node head)
{
      Node p=head;
      do{
          System.out.print(head.data+" ");
          head=head.next;
      }
      while(p!=head);
}

static Node insertatfirst(Node head,int data)
{
      Node ptr=new Node(data);
        Node p=head;
        while(p.next!=head)
        {
             p=p.next;
        }
        p.next=ptr;
        ptr.next=head;
        head=head.next;
        head=ptr;
        return head;
}
static Node insertatgivenindex(Node head,int index,int data)
{
    Node ptr=new Node(data);
    Node p=head;
    int i=0;
    while(i!=index-1)
    {
        p=p.next;
        i++;
    }
    ptr.next=p.next;
    p.next=ptr;
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
    ptr.next=head;
    return head;

}
public static void main(String[]args){
    Node head=new Node(20);
    Node second=new Node(30);
    Node third=new Node(40);

    head.next=second;
    second.next=third;
    third.next=head;

    System.out.print("Before first: ");
    display(head);

  
    System.out.println();
    System.out.print("after first: ");
    head=insertatfirst(head,10);
    display(head);

    System.out.println();
    System.out.print("aftergivenindex: ");
    head=insertatgivenindex(head,2,50);
    display(head);
    
    System.out.println();
    System.out.print("after end: ");
    head=insertatend(head,80);
    display(head);
}
}