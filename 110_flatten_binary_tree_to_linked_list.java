import java.util.*;
public class binarytree{
    public static class Node{
            Node left;
            int data;
            Node right;
        Node(int data)
        {
            this.left=null;
            this.right=null;
            this.data=data;
        }
    }
static void flatten(Node root)
{
      while(root!=null)
      {
        if(root.left!=null)         //diagram dekhakar banaye
        {
            Node curr=root.left;
            while(curr.right!=null)
            {
                 curr=curr.right;
            }
            curr.right=root.right;
            root.right=root.left;
            root.left=null;
        }
        root=root.right;
      }
}
static void inorder(Node root)
{
  // base condition
  if (root == null) {
    return;
  }
  inorder(root.left);
  System.out.print(root.data+ " ");
  inorder(root.right);
}
public static void main(String[]args){
    Node root=new Node(1);
    root.left=new Node(2);
    root.left.left=new Node(3);
    root.left.right=new Node(4);
    root.right=new Node(5);
     root.right.right=new Node(6);

    flatten(root);
     
   inorder(root);
}
}