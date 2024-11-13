import java.util.*;
public class binary{
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
  static boolean isBST(Node root,int min,int max)
  {
       if(root==null)
       { 
        return true;
       }
       if(root.data>=min && root.data<=max)
       {
            boolean left=isBST(root.left,min,root.data);
            boolean right=isBST(root.right,root.data,max);
            return (left && right);
       }else
       return false;
  }
 static boolean validate(Node root)
  {
       return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
  }
  public static void main(String[]args){
    Node root=null;
    root=new Node(50);
    root.left=new Node(40);
    root.right=new Node(60);
    root.left.left=new Node(30);
    root.right.right=new Node(70);

  //  System.out.print(validate(root));
  if(validate(root))
  {
    System.out.print("it is valid BST ");
  }else{
    System.out.print("it is not valid BST ");
  }
  }
}