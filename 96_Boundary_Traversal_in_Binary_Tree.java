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
public class boundary{
static Node root;
static void printleaf(Node node)
{
       if(node==null)
       {
        return ;
       }
    printleaf(node.left);
    if(node.left==null && node.right==null)
    {
        System.out.print(node.data+" ");
    }
    printleaf(node.right);
}
static void boundaryleft(Node node)
{
         if(node==null)
         {
            return;
         }
         if(node.left!=null)
         {
            System.out.print(node.data+" ");
            boundaryleft(node.left);
         }
         else if(node.right!=null)
         {
             System.out.print(node.data+" ");
             boundaryleft(node.right);
         }
}
static void boundaryright(Node node)
{
       if(node==null)
       {
        return;
       }
       if(node.right!=null)
       {
        boundaryright(node.right);
        System.out.print(node.data+" ");
       }
       else if(node.left!=null)
       {
        boundaryright(node.left);
        System.out.print(node.data+" ");
       }
}
static void boundarytraversal(Node node)
{
       if(node==null)
       {
        return;
       }
       System.out.print(node.data+" ");

       boundaryleft(node.left);

       printleaf(node.left);
       printleaf(node.right);

       boundaryright(node.right);

}
public static void main(String[]args){
    boundary s=new boundary();
    s.root=new Node(10);
    s.root.left=new Node(20);
    s.root.right=new Node(30);
    s.root.left.left=new Node(40);
    s.root.left.right=new Node(50);
    

    boundarytraversal(s.root);

}
}