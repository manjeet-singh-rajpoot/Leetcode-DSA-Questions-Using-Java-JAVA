import java.util.*;
import java.util.Scanner;
public class  binarytree{
    public static class Node{
        int data;
        Node left;
        Node right;
    
     Node(int data)
     {
         this.data=data;
         this.left=null;
         this.right=null;
     }
    }

static Node createnode(Node root)
{
     System.out.println("enter data : ");
     int data;
     Scanner s=new Scanner(System.in);
          data=s.nextInt();
          root=new Node(data);
     if(data==-1)
     {
        return null;
     }

    System.out.println("enter data for left node: "+data);
    root.left=createnode(root.left);

    System.out.println("enter data for right node: "+data);
    root.right=createnode(root.right);

    return root;
    
}
public static void main(String[]args){
Node head=null;
head=createnode(head);   
}
}
