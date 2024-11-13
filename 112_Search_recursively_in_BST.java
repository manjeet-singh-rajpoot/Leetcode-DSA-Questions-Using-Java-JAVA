import java.util.*;
public class search{
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
     //recursively//
 static boolean searchBST(Node root,int x)
 {
        if(root==null)
        {
            return false;
        }
        if(x==root.data)
        {
            return true;
        }
        if(x<root.data)
        {
            return searchBST(root.left,x);
        }
        else if(x>root.data)
        {
           return searchBST(root.right,x);
        }
        return false;
 }
public static void main(String[]args){
    Node root=null;
    root=new Node(50);
    root.left=new Node(40);
    root.right=new Node(60);
    root.left.right=new Node(45);
    root.right.left=new Node(55);

    int x=55;

   System.out.print(searchBST(root,x));
}
}