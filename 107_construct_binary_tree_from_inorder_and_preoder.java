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
static int preindex=0;
static Node buildtree(int in[],int pre[],int instart,int inend)
{
      if(instart>inend)
      {
          return null;
      }
      int curr=pre[preindex++];
      Node tNode=new Node(curr);
      if(instart==inend)
      {
         return tNode;
      }
    
      int inindex=mp.get(curr);

      tNode.left=buildtree(in,pre,instart,inindex-1);
      tNode.right=buildtree(in,pre,inindex+1,inend);

      return tNode;
}
static Node buildwrap(int in[],int pre[],int len){
       for(int i=0;i<len;i++)
       {
           mp.put(in[i],i);
       }
       return buildtree(in,pre,0,len-1);
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
static void preorder(Node node)
{
      if(node==null)
      {
        return ;
      }
    System.out.print(node.data+" ");
    preorder(node.left);
    preorder(node.right);
}
public static void main(String[]args){
  int in[]={3,1,4,0,5,2};
  int pre[]={0,1,3,4,2,5};
  int n=in.length;

  Node root=buildwrap(in,pre,n);

  System.out.println("inoder output is: ");
  inorder(root);
  System.out.println();
  System.out.println("preoder output is: ");
  preorder(root);
}
}