/*    Add two Number:- 
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
 * 
 */
//Definition for singly-linked list.
public class ListNode {   
          int val;    
     ListNode next;
     ListNode() {}   
     ListNode(int val) {
        this.val=val;
     }    
    ListNode(int val, ListNode next) 
    {
     this.val = val; 
     this.next = next;
    } 
    }

 class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
                       ListNode l3=new ListNode();
                       int c=0;
                    while(l1!=null && l2!=null){

                        if(l1.next==null && l2.next!=null){
                              l3.val=(l2.val+l1.val+c)%10;
                              c=(l2.val+l1.val+c)/10;

                              l2=l2.next;
                        }else if(l1.next!=null && l2.next==null){
                               l3.val=(l1.val+l2.val+c)%10;
                               c=(l1.val+l2.val+c)/10;
                               l1=l1.next;
                        }else{
                               l3.val=(l1.val+l2.val+c)%10;
                               c=(l1.val+l2.val+c)/10;

                               l1=l1.next;
                               l2=l2.next;

                               if(l1!=null || l2!=null){
                                   l3.next=new ListNode();
                                   l3=l3.next;
                               }
                               if(l1==null && l2==null && c!=0){
                                   l3.next=new ListNode(c);
                                   l3=l3.next;
                               }
                        }

                    }
                    return l3;



                  
   }
  }

