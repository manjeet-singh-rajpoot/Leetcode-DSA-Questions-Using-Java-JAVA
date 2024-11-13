import java.util.*;
 class Node{
    Node left;
    int data;
    Node right;
    Node(final int data)
    {
        this.left=null;
        this.data=data;
        this.right=null;
    }
}
public class largest{
   
static class nodeinfo{
    int max;
    int min;
    boolean isBST;
    int size;

    nodeinfo() {};
    nodeinfo(int max,int min,int size,boolean isBST)
    {
        this.max=max;
        this.min=min;
        this.size=size;
        this.isBST=isBST;
    }
} 
static int MAX=Integer.MAX_VALUE;
static int MIN=Integer.MIN_VALUE;    
static nodeinfo largestBst(Node root)
{
     if(root==null)
     {
        return new nodeinfo(Integer.MIN_VALUE,Integer.MAX_VALUE,0,true);
     }
    
    nodeinfo left=largestBst(root.left);
    nodeinfo right=largestBst(root.right);

    nodeinfo returninfo=new nodeinfo();

    returninfo.min=Math.min(left.min,root.data);
    returninfo.max=Math.max(right.max,root.data);

    returninfo.isBST=left.isBST && right.isBST  && root.data>left.max  && root.data<right.min;
     
    if( returninfo.isBST)
    {
        returninfo.size=left.size+right.size+1;
    }else{
        returninfo.size=Math.max(left.size,right.size);
    }

return returninfo;

}
static int largestbst(Node root)
{
    return largestBst(root).size;
}
public static void main(String[]args){
    
      /* Let us construct the following Tree
         60
        /  \
       65  70
      /
     50 */

     final Node node1 = new Node(60);
     node1.left = new Node(65);
     node1.right = new Node(70);
     node1.left.left = new Node(50);
 
     System.out.print("Size of the largest BST is "
                      + largest.largestbst(node1)
                      + "\n");

}
}