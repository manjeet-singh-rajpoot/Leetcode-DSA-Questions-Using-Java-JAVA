import java.util.*;
public class circular{
 public static class Node{
        int data;
        Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
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

static Node deleteatfirst(Node head)
{
       Node r=head;
       Node p=head;
       Node q=head.next;
       while(p.next!=head)
       {
        p=p.next;
       }
      p.next=q;
      head=q;
      r=null;
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
   q=null;
   return head;
}

static Node deleteend(Node head)
{
      Node p=head;
      Node q=head.next;
      while(q.next!=head)
      {
          p=p.next;
          q=q.next;
      }
    p.next=head;
    q=null;
    return head;
}
public static void main(String[]args){
    Node head=new Node(20);
    Node second=new Node(30);
    Node third=new Node(40);
    Node fourth=new Node(50);
    Node five=new Node(60);

    head.next=second;
    second.next=third;
    third.next=fourth;
    fourth.next=five;
    five.next=head;

    System.out.println("Before first: ");
    display(head);
    
    System.out.println();
    System.out.println("after first delete: ");
    head=deleteatfirst(head);
    display(head);

    System.out.println();
    System.out.println("after index delete: ");
    head=deleteatindex(head,2);
    display(head);

    System.out.println();
    System.out.println("after end delete: ");
    head=deleteend(head);
    display(head);

}
}