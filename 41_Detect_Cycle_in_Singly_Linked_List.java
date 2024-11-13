import java.util.*;
import java.util.HashSet;
//import java.util.Map;
public class detect{
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
static boolean detect(Node head)
{
   HashSet<Node>s=new HashSet<Node>();

      while(head!=null)
      {
           if(s.contains(head))
           {
              return true;
           }
        s.add(head);
        head=head.next;
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
  
  if(detect(head))
  {
    System.out.println("Loop Found");
  }else{
    System.out.println("Not Loop Found");
  }
}
}