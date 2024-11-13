import java.util.*;
class Node{
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
class checkbalance{
Node root1;
Node root2;
static boolean identical(Node node1,Node node2)
{
       //base case//
         if(node1==null && node2==null)
         {
            return true;
         }
         if(node1!=null && node2 ==null)
         {
            return false;
         }
         if(node1==null && node2!=null)
         {
             return false;
         }

    boolean left=identical(node1.left,node2.left);
    boolean right=identical(node1.right,node2.right);

    boolean ans=node1.data==node2.data;

    if(left && right && ans)
    {
        return true;
    }else{
        return false;
    }

}
public static void main(String[]args){
    checkbalance d1=new checkbalance();

    d1.root1=new Node(1);
    d1.root1.left=new Node(2);
    d1.root1.right=new Node(3);

    checkbalance d2=new checkbalance();
    d2.root2=new Node(10);
    d2.root2.left=new Node(20);
    d2.root2.right=new Node(90);

  System.out.println("check identical : "+identical(d1.root1,d2.root2));
}
}