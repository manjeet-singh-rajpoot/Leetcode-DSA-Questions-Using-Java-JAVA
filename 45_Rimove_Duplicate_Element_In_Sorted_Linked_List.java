import java.util.*;
public class remove{
       public static class Node{
        int data;
        Node next;
      Node(int data)
     {
          this.data=data;
          this.next=null;
      }
 } 

 static void display(Node ptr)
 {
      while(ptr!=null)
      {
          System.out.print(ptr.data+" ");
          ptr=ptr.next;
      }
 }

 static Node rimoveduplicate(Node head)
 {
    if(head==null)
    {
        return null;
    }
  Node curr=head;
  Node q=curr.next;

  while(curr!=null)
  {
      if(curr!=null && head.data==head.next.data)
      {
           Node r=q.next;
           curr.next=r;
           q=null;
      }else{
        curr=curr.next;
      }
  }
  return head;
 }

 public static void main(String[]args){
    Node head=new Node(20);
    Node second=new Node(20);
    Node third=new Node(30);
    Node fourth=new Node(40);

   head.next=second;
   second.next=third;
   third.next=fourth;
   fourth.next=null;
System.out.println("Before insert: ");
 display(head);

 System.out.println();
 System.out.println("after  remove: ");
 head=rimoveduplicate(head);
 display(head);
 }
}