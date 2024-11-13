import java.util.*;
public class heap{
static class Node{
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
static void preorder(Node root)
{
       if(root==null)
       {
          return;
       }
       System.out.print(root.data+" ");
       preorder(root.left);
       preorder(root.right);
}
static void BST_To_array(Node root,ArrayList<Integer>a)
{
       if(root==null)
       {
        return ;
       }
    BST_To_array(root.left,a);
    a.add(root.data);
    BST_To_array(root.right,a);
}
static int index=0;
static void Array_To_minheap(Node root,ArrayList<Integer>arr)
{
      if(root==null)
      {
        return;
      }
    root.data=arr.get(index++);
    Array_To_minheap(root.left,arr);
    Array_To_minheap(root.right,arr);
}
static void convertominheap(Node root)
{
   index=0;
   ArrayList<Integer>list=new ArrayList<>();
   BST_To_array(root,list);
   Array_To_minheap(root,list);
}
public static void main(String[]args){
       // BST formation
       Node root = new Node(4);
       root.left = new Node(2);
       root.right = new Node(6);
       root.left.left = new Node(1);
       root.left.right = new Node(3);
       root.right.left = new Node(5);
       root.right.right = new Node(7);

       convertominheap(root);
       preorder(root);
}
}