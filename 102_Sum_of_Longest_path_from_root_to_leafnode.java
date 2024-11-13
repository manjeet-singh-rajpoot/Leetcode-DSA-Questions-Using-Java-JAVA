import java.util.*;
public class sum{
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
static int maxlen;
static int maxsum;
static void rootToleaf(Node node,int sum,int len)
{
          if(node==null)
          {
              if(maxlen<len)
             {
                 maxlen=len;
                 maxsum=sum;
              }
             else if(maxlen==len && maxsum<sum)
                     maxsum=sum;
              return ;
          }
          rootToleaf(node.left,sum+node.data,len+1);
          rootToleaf(node.right,sum+node.data,len+1);
}
static int findans(Node node)
{
       if(node==null)
       {
        return 0;
       }
       maxsum=0;//Integer.MIN_VALUE;
       maxlen=0;

       rootToleaf(node,0,0);

       return maxsum;
}
public static void main(String[]args){
    Node root = new Node(4);         /*        4        */
    root.left = new Node(2);         /*       / \       */
    root.right = new Node(5);        /*      2   5      */
    root.left.left = new Node(7);    /*     / \ / \     */
    root.left.right = new Node(1);   /*    7  1 2  3    */
    root.right.left = new Node(2);   /*      /          */
    root.right.right = new Node(3);  /*     6           */
    root.left.right.left = new Node(6);
  
    System.out.println( "Sum = "+findans(root));

}
}