/*
 *  Question : 
 * 
 *    Given the head of a linked list, return the list after sorting it in ascending order.

 

Example 1:


Input: head = [4,2,1,3]
Output: [1,2,3,4]
Example 2:


Input: head = [-1,5,3,4,0]
Output: [-1,0,3,4,5]
Example 3:

Input: head = []
Output: []
 

Constraints:

The number of nodes in the list is in the range [0, 5 * 104].
-105 <= Node.val <= 105
    
 */

import java.util.*;
    public class 361_Sort_ListNode {
    int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    
public static void display(ListNode head){
        while(head!=null){
          System.out.print(head.val+" ");
          head=head.next;
        }
  }

  public static ListNode sortList(ListNode head) {
            
          int count=0;
          ListNode temp=head;
    
      while(temp!=null){
          count++;
          temp=temp.next;
      }

      int arr[]=new int[count];
      temp=head;

      for(int i=0;i<count;i++){
          arr[i]=temp.val;
          temp=temp.next;
      }
       
      Arrays.sort(arr);
     
      temp=head;

      for(int i=0;i<count;i++){
          temp.val=arr[i];
          temp=temp.next;
      }

        return head;
  }


    public static void main(String[] args) {
        ListNode head=new ListNode();
        ListNode second=new ListNode();
        ListNode third=new ListNode();
        ListNode fourth=new ListNode();
    
        
        head.val=4;
        head.next=second;
    
        second.val=2;
        second.next=third;
    
        third.val=1;
        third.next=fourth;
    
        fourth.val=3;
        fourth.next=null;
    
     System.out.println("Before: ");
     display(head);
     System.out.println();
     System.out.println("After: ");
     head=sortList(head);
     display(head);
}
}
