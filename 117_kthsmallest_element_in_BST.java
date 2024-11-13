import java.util.*;
public class smallest{
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
static int count=0;
static Node kthsmallest(Node root,int k)
{
      if(root==null)
      {
        return null;
      }
    Node left=kthsmallest(root.left,k);

    if(left!=null)
    {
        return left;
    }

    count++;

    if(count==k)
    {
        return root;
    }

    return kthsmallest(root.right,k);
    
}
static void print(Node root,int k)
{
    Node res=kthsmallest(root,k);
      if(root==null)
      {
        System.out.print("it is null");
      }else{
        System.out.print("data is : "+res.data);
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
    Node root=null;
    root=new Node(50);
    root.left=new Node(40);
    root.right=new Node(60);
    root.left.left=new Node(30);
    root.right.right=new Node(70);

    int k=3;
    print(root,k);
System.out.println();
    inorder(root);
}
}