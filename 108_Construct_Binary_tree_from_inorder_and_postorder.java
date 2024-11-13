import java.util.*;
public class binarytree{
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
static HashMap<Integer,Integer>mp=new HashMap<>();
static int postinedx=0;
static Node buildtree(int in[],int post[],int n,int instart,int inend)
{
      if(instart>inend)
      {
        return null;
      }
         int curr=post[postinedx--];
         Node tNode=new Node(curr);
    
      if(instart==inend)
      {
         return tNode;
      }

     int inindex=mp.get(curr);

     tNode.right=buildtree(in,post,n,inindex+1,inend);
     tNode.left=buildtree(in,post,n,instart,inindex-1);

     return tNode;
}
static Node buildwrap(int post[],int in[],int n)
{
      for(int i=0;i<n;i++)
      {
          mp.put(in[i],i);
      }
      postinedx=n-1;
      return buildtree(in,post,n,0,n-1);
}
static void inorder(Node node)
{
      if(node==null)
      {
        return ;
      }
    inorder(node.left);
    System.out.print(node.data+" ");
    inorder(node.right);
}
public static void main(String[]args){
   int in[]={4,3,5,6};
   int post[]={4,6,5,3};
   int n=in.length;
   
   Node root=buildwrap(post,in,n);
   inorder(root);

}
}