                            //Insertion In Singly Linked List//
                           import java.util.*;
                            public class riverse{
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
                             static Node reverseList(Node temp){  
                                Node current = temp;  
                                Node prevNode = null, nextNode = null;  
                            
                               //Swap the previous and next nodes of each node to reverse the direction of the list  
                                while(current != null){  
                                    nextNode = current.next;  
                                    current.next = prevNode;  
                                    prevNode = current;  
                                    current = nextNode;  
                                }  
                                return prevNode;  
                            }  
                            
                             static void riverse(Node head)
                             {
                                   if(head==null)
                                   {
                                    return ;
                                   }
                                  riverse(head.next);
                                  System.out.print(head.data+" "); 
                             }
                             
                             static Node insertatfirst(Node head,int data)
                             {
                                  Node ptr=new Node(data);
                                    ptr.next=head;
                                    ptr.data=data;
                                    head=head.next; 
                                    head=ptr;
                                    return head;
                             }
                            
                            static Node insertatgivenindex(Node head,int index,int data)
                            {
                                    Node ptr=new Node(data);
                                    Node p=head;
                                    int i=0;
                                 while(i!=index-1)
                                 {
                                     p=p.next;
                                     i++;
                                 }
                                 ptr.next=p.next;
                                 p.next=ptr;
                                 return head;
                            }
                            
                            static Node insertatend(Node head,int data)
                            {
                                Node ptr=new Node(data);
                                Node p=head;
                                while(p.next!=null)
                                {
                                     p=p.next;
                                }
                                p.next=ptr;
                                ptr.next=null;
                            return head;
                            }
                            
                            static int length(Node head)
                            {
                                  int count=0;
                                  while(head!=null)
                                  {
                                      count++;
                                      head=head.next;
                                  }
                                  return count;
                            }
                            
                            public static void main(String[]args){
                                Node head=new Node(20);
                                Node second=new Node(30);
                                Node third=new Node(40);
                            
                               head.next=second;
                               second.next=third;
                               third.next=null;
                            System.out.println("Before insert: ");
                             display(head);
                             System.out.println();
                            
                             System.out.println("after insert: ");
                              head=insertatfirst(head,10);
                              display(head);
                            
                              System.out.println();
                              System.out.println("After indexing : ");
                              head=insertatgivenindex(head,2,60);
                              display(head);
                            
                              System.out.println();
                              System.out.println("After end riverse : ");
                              head=insertatend(head,80);
                              riverse(head);
                            
                              System.out.println();
                              System.out.println("Total nodes are : "+length(head));
                            
                              System.out.println("reverse list ");
                              head=insertatfirst(head,10);
                              reverseList(head);
        
                              
                            }
                            }