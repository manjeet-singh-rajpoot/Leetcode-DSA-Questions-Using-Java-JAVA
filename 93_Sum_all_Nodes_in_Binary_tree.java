import java.util.*;
class Node{
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
public class sum{
  static  Node root;
  static int sumof(Node node)
    {
        if(node==null)
        {
            return 0;
        }
         return sumof(node.left)+sumof(node.right)+node.data;
    }
public static void main(String[]args){
    sum s=new sum();
    s.root=new Node(10);
    s.root.left=new Node(20);
    s.root.right=new Node(30);
    int sumn=sumof(root);
    System.out.println("Sum of all nodes: "+sumn);

}
}