/*
 * Question: 
 * 
 *    Given the head of a linked list, remove the nth node from the end of the list and return its head.

 

Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]
 

Constraints:

The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz
 


 */

public class 365_Remove_Nth_Node_from_End_of_LinkedList_2 {
   
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
        
     
           public ListNode removeNthFromEnd(ListNode head, int n) {
                  ListNode ans=new ListNode(0,head);
                  ListNode p=ans;
                 
                 for(int i=0;i<n;i++){
                     head=head.next;
                 }
               
               while(head!=null){
                    head=head.next;
                    p=p.next;
               }
               p.next=p.next.next;
       
           return ans.next;
       
           }
          

