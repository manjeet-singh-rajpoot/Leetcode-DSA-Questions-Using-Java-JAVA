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
static int count(Node root)
{
      if(root==null)
      {
        return 0;
      }
    int ans=1+count(root.left)+count(root.right);
    
    return ans;

}
static boolean isCBT(Node root,int index,int totalcount)
{
    if(root==null)
    {
        return true;
    }
    if(index>totalcount)
    {
        return false;
    }
    else{
        boolean left=isCBT(root.left,2*index+1,totalcount);
        boolean right=isCBT(root.right,2*index+2,totalcount);
       return (left && right);
    }
}
static boolean ismaxheap(Node root)
{
       if(root.left==null && root.right==null)
       {
        return true;
       }
       if(root.right==null)
       {
         return (root.data>root.right.data);
       }
       if(root.left==null)
       {
         return (root.data>root.left.data);
       }
       else{
        boolean left=ismaxheap(root.left);
        boolean right=ismaxheap(root.right);

        if(left && right && root.data>root.left.data && root.data>root.right.data)
        {
            return true;
        }else{
            return false;
        }
       }
}
static boolean isheap(Node root)
{
      int index=0;
      int totalcount=count(root);

      if(isCBT(root,index,totalcount) && ismaxheap(root))
      {
         return true;
      }
      else{
        return false;
      }
}
public static void main(String[]args){
      // Array representation of Max-Heap
        // 10
        //    /  \
        // 5    3
        //  / \
        // 2   4
       Node root=null;
       root=new Node(10);
       root.left=new Node(5);
       root.right=new Node(3);
       root.left.right=new Node(4);
       root.left.left=new Node(2);

    System.out.print("isHeap: "+ isheap(root));
}
}
