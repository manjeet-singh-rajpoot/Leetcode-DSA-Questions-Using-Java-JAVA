/*Reverse Nodes in kth another way:


Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.

 

Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [2,1,4,3,5]
Example 2:


Input: head = [1,2,3,4,5], k = 3
Output: [3,2,1,4,5]
 * 
 * 
 */


public class 296_Reverse_Node_in_Kth_another_Way {
    public ListNode reverseKGroup(ListNode head, int k) {

        if(head==null || head.next==null || k==1){
         return head;
        }
      
      ListNode temp=head;
      int count=0;
     
      while(temp!=null && count<k){
          temp=temp.next;
          count++;
      }
     
        if(count<k){
         return head;
     }
     
               ListNode prev=null;
               ListNode curr=head;
               ListNode  next;
     
               count=0;
     
            while(curr!=null && count<k){
                  next=curr.next;
                  curr.next=prev;
                  prev=curr;
                  curr=next;
                  count++;
            }
     
            if(curr!=null){
               head.next=reverseKGroup(curr,k);
            }
     
            return prev;
     
         }
}
