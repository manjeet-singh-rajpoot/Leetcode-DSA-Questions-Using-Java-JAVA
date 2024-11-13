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
class diameter{
Node root;
int gethight(Node node)
{
      if(node==null)
      {
        return 0;
      }
    int left=gethight(node.left);
    int right=gethight(node.right);
    if(left>right)
    {
        return (left+1);
    }else{
         return (right+1);
    }
}
boolean checkbal(Node node)
{
     if(node==null)
     {
        return true;
     }
     boolean left=checkbal(node.left);
     boolean right=checkbal(node.right);
     boolean ans=Math.abs(gethight(node.left)-gethight(node.right))<=1;
     if(left && right && ans)
     {
        return true;
     }else{
        return false;
     }

}
public static void main(String[]args){
    diameter d=new diameter();

    d.root=new Node(1);
    d.root.left=new Node(2);
    d.root.right=new Node(3);
    d.root.left.left=new Node(4);
    d.root.right.right=new Node(5);
    d.root.right.right.right=new Node(9);
   
    System.out.println("hight is : "+d.gethight(d.root));

    System.out.println("check balance : "+d.checkbal(d.root));
}
}