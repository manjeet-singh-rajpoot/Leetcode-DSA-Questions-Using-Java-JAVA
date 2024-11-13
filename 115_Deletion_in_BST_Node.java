import java.util.*;
public class delete{
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
  static int minvalue(Node root)
  {
         Node temp=root;
         while(temp.left!=null)
         {
              temp=temp.left;
         }
         return temp.data;
  }
static Node deletenode(Node root,int val)
{
      if(root==null)
      {
         return root;
      }
      if(root.data==val)
      {
          //0 child//
        if(root.left==null && root.right==null)
        {
              root=null;
              return null;
        }
          //1 child //
          //for left child
        if(root.left!=null && root.right==null)
        {
             Node temp=root.left;
             root=null;
             return temp;
        }
        //For right child
        if(root.left==null && root.right!=null)
        {
              Node temp=root.right;
              root=null;
              return temp;
        }
        //2 child//
        if(root.left!=null && root.right!=null)
        {
               int mini=minvalue(root.right);
               root.data=mini;
               root.right=deletenode(root.right,mini);
               return root;
        }
      }
      if(val<root.data)
      {
          root.left=deletenode(root.left,val);
          return root;
      }
      else if(val>root.data)
      {
        root.right=deletenode(root.right,val);
      }
    return null;
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
    Node root=null;
    root=new Node(50);
    root.left=new Node(40);
    root.right=new Node(60);
    root.left.right=new Node(45);
    root.right.left=new Node(55);
    System.out.println("before deletion : ");
    inorder(root);
    System.out.println();
    System.out.println("after deletion : "+deletenode(root,40));
    inorder(root);

}
}