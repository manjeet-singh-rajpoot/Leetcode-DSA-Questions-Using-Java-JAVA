import java.util.*;
import java.util.ArrayList;
public class pali{
    public static class Node{
        int data;
        Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
static void display(Node s)
{
      while(s!=null)
      {
          System.out.print(s.data+" ");
          s=s.next;
      }
}
static boolean checkpal(int v[])
{
        int n=4;
        int s=0;
        int e=n-1;
     while(s<=e)
     {
         if(v[s]!=v[e])
         {
            return false;
         }else if(v[s]==v[e]){
           return true;
         }
         s++;
         e--;
     }
     return true;

}
static int findlength(Node head) 
{ 
    Node curr = head; 
    int cnt = 0; 
    while (curr != null) 
    { 
        cnt++; 
        curr = curr.next; 
    } 
    return cnt; 
} 
static boolean convertArr(Node head) 
{ 
  
    // Find the length of the 
    // given linked list 
    int len = findlength(head); 
  
    // Create an array of the 
    // required length 
    int []arr = new int[len]; 
  
    int index = 0; 
    Node curr = head; 
  
    // Traverse the Linked List and add the 
    // elements to the array one by one 
    while (curr != null)  
    { 
        arr[index++] = curr.data; 
        curr = curr.next; 
    } 
  
    // Print the created array 
  //  printArr(arr, len); 
    return checkpal(arr);
} 
  
public static void main(String[]args){
       Node a=new Node(10);
       Node b=new Node(20);
       Node c=new Node(20);
       Node d=new Node(10);
    
        a.next=b;
        b.next=c;
        c.next=d;
    
    display(a);
    System.out.println();
    if(convertArr(a))
    {
        System.out.println("pallindrom");
    }else{
        System.out.println("Not pallindrom");
    }
}
}