import java.util.*;
public class minvalue{
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
       while(root!=null){
        if(x==root.data)
        {
            return true;
        }
        if(x<root.data)
        {
           root=root.left;
        }
        else if(x>root.data)
        {
           root=root.right;
        }
    }
        return false;
 }
 static int minvaues(Node root)
 {
        Node temp=root;
        while(temp.left!=null)
        {
             temp=temp.left;
        }
        return temp.data;
 }
 static int maxvaues(Node root)
 {
        Node temp=root;
        while(temp.right!=null)
        {
             temp=temp.right;
        }
        return temp.data;
 }
public static void main(String[]args){
    Node root=null;
    root=new Node(50);
    root.left=new Node(40);
    root.right=new Node(60);
    root.left.right=new Node(45);
    root.right.left=new Node(55);

    int x=55;

   System.out.println("search : "+searchBST(root,x));
   System.out.println("min : "+minvaues(root));
   System.out.println("max : "+maxvaues(root));
}
}