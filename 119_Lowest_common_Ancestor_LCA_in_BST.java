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
static int LCA(Node root,int p,int q)
{
        if(root==null)
        {
            return -1;
     }
      if(p>root.data && q>root.data)
      {
           return LCA(root.right,p,q);
      }
      if(p<root.data && q<root.data)
      {
           return LCA(root.left,p,q);
      }
      return root.data;
}
public static void main(String[]args){
    Node root=null;
    root=new Node(50);
    root.left=new Node(40);
    root.right=new Node(60);
    root.left.left=new Node(30);
    root.right.right=new Node(70);
    root.left.right=new Node(45);
     
    System.out.print(LCA(root,30,45));


}
}