import java.util.*;
public class middle{
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
      while(head!=null)
      {
        System.out.print(head.data+" ");
        head=head.next;
      }
}
 static int listlength(Node head)
{
    int length=0;
   while(head!=null)
   {
        length++;
        head=head.next;
   }
   return length;
}

static Node middle(Node head)
{
    int length=listlength(head);
    Node temp[]=new Node[length];
    int count=0;
    while(head!=null)
    {
        temp[count]=head;
        count++;
        head=head.next;
    }
    return temp[count/2];
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
   five.next=null;

System.out.println("Before insert: ");
 display(head);
 System.out.println();

 System.out.println("length is : "+listlength(head)+" ");

 //System.out.println();
 System.out.println("Find middle LinkedList: ");
 head=middle(head);
 display(head);
}
}