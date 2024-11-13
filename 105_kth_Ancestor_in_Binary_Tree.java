import java.util.*;  //output mistake //
public class ancester{
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
static Node kthpath(Node root,int k,int node)
{
         if(root==null)
         {
            return null;
         }
         if(root.data==node)
         {
            return root;
         }

     Node leftans=kthpath(root.left,k,node);
     Node rightans=kthpath(root.right,k,node);
 
    if(leftans!=null && rightans==null)
    {
         k--;
         if(k<=0)
         {
             k=Integer.MAX_VALUE;
             return root;
         }
         return leftans;
    }
    if(leftans==null && rightans!=null)
    {
         k--;
         if(k<=0)
         {
            k=Integer.MAX_VALUE;
             return root;
         }
         return rightans;
    }
    return null;
}
static int kthancestor(Node root,int k,int node)
{
      Node ans=kthpath(root,k,node);
      if(ans==null || ans.data==node)
      {
          return -1;
      }else{
        return ans.data;
      }
}
public static void main(String[]args){
    Node root=new Node(1);
    root.right=new Node(3);
    root.left=new Node(2);
    root.left.right=new Node(5);
    root.left.left=new Node(4);
    System.out.print("ans is :  "+kthancestor(root,2,4));
}
}