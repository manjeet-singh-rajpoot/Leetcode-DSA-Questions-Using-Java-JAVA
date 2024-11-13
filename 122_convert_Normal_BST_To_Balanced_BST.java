import java.util.*;
public class raj{
    public static class Node{
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
static void inorder(Node root,Vector<Node>list)
{
         if(root==null)
         {
            return ;
         }
         inorder(root.left,list);
        list.add(root);
        inorder(root.right,list);
}
static Node convert(Vector<Node>list,int s,int e)
{
       int mid=(s+e)/2;
    if(s>e)
    {
        return null;
    }
    Node temp=list.get(mid);
    temp.left=convert(list,s,mid-1);
    temp.right=convert(list,mid+1,e);

    return temp;
}
static Node balance(Node root)
{
      Vector<Node>list=new Vector<>();
      inorder(root,list);
      int n=list.size();
      return  convert(list,0,n-1);
}
static void preorder(Node root)
{
     if(root==null)
     {
        return ;
     }
     System.out.print(root.data+" ");
     preorder(root.left);
     preorder(root.right);
}
public static void main(String[]args){
    Node root=null;
    root=new Node(50);
    root.left=new Node(40);
    root.right=new Node(60);
    root.left.left=new Node(30);
    root.right.right=new Node(70);

    balance(root);
    preorder(root);

}
}