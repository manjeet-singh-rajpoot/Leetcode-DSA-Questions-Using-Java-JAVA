                   //Lowest Common Ancestor in binary tree//

import java.util.*;
public class sum{
    public static class Node{
        Node left;
        int data;
        Node right;
        Node(int data)
        {
            this.left=null;
            this.data=data;
            this.right=null;
        }
    }
static Node loc(Node root,int n1,int n2)
{
      if(root==null)
      {
        return null;
      }
      if(root.data==n1 || root.data==n2)
      {
        return root;
      }

      Node leftroot=loc(root.left,n1,n2);
      Node rightroot=loc(root.right,n1,n2);

      if(leftroot!=null && rightroot!=null)
      {
          return root;
      }
      else if(leftroot==null && rightroot!=null)
      {
          return rightroot;
      }
      else if(leftroot!=null && rightroot==null)
      {
          return leftroot;
      }else
      return null;
}

public static void main(String[]args){
    Node root = new Node(4);         /*        4        */
    root.left = new Node(2);         /*       / \       */
    root.right = new Node(5);        /*      2   5      */
    root.left.left = new Node(7);    /*     / \ / \     */
    root.left.right = new Node(1);   /*    7  1 2  3    */
    root.right.left = new Node(2);   /*      /          */
    root.right.right = new Node(3);  /*     6           */
    root.left.right.left = new Node(6);
  
    System.out.print("LOC  (2,3): "+loc(root,2,3).data);
    
}
}