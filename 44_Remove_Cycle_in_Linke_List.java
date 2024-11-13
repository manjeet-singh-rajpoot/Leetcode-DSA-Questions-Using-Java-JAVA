import java.util.*;
//import java.util.HashSet;
//import java.util.Map;
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
static void display(Node head)
{
       Node p=head;
       do{
           System.out.print(p.data+" ");
           p=p.next;
       }while(p!=head);
}
static Node floyeddetect(Node head)
{
     if(head==null)
     {
        return null;
     }    
    Node slow=head;
    Node fast=head;

    while(slow!=null && fast!=null)
    {
        fast=fast.next;
       if(fast!=null)
        {
            fast=fast.next;
         }
       slow=slow.next;
       if(slow==fast)
       {
         return slow;
       }
    }
  return null;
}
static Node getstartloop(Node head)
{
      if(head==null)
      {
        return null;
      }
       Node p=floyeddetect(head);
       Node slow=head;
    while(slow!=p)
    {   
        slow=slow.next;
        p=p.next;
    }
    return slow;
}
static Node rimovecycle(Node head)
{
      if(head==null)
      {
        return null;
      }
      Node p=getstartloop(head);
      Node temp=p;
    while(temp.next!=p)
    {
          temp=temp.next;
    }
    temp.next=null;
   return head;
}
public static void main(String[]args){
    Node head=new Node(10);
    Node second=new Node(20);
    Node third=new Node(30);
    Node fourth=new Node(40);

    head.next=second;
    second.next=third;
    third.next=fourth;
    fourth.next=second;
  System.out.println("data is : "+getstartloop(head).data);
   
  head=rimovecycle(head);
  display(head);
}
}