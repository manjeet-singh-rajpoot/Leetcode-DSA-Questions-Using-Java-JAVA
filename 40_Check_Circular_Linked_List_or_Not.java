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
            if(p!=null)
            {

                 System.out.print(p.data+" ");
                 p=p.next;
            }
            else{
                System.out.print("not a circular Linked List");
            }
         }while(p!=head);
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
    

}
}