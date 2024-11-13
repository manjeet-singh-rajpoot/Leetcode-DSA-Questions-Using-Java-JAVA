import java.util.*;
//import java.util.HashSet;
//import java.util.Map;
public class floy{
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
           System.out.println(p.data+" ");
           p=p.next;
       }while(p!=head);
}
static boolean floyeddetect(Node head)
{
     if(head==null)
     {
        return false;
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
         return true;
       }
    }
  return false;
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
   
  //System.out.println("Display: ");
 // head=detect(head);
 // display(head);
  
  if(floyeddetect(head))
  {
    System.out.println("Loop Found");
  }else{
    System.out.println("Not Loop Found");
  }
}
}