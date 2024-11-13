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

int getdiameter(Node node)
{
      if(node==null)
      {
         return 0;
      }
    int op1=getdiameter(node.left);
    int op2=getdiameter(node.right);
    int op3=gethight(node.left)+gethight(node.right)+1;
      if(op1>op2)
      {
          if(op1>op3)
          {
              return op1;
          }
      }else if(op2>op3)
      {
        if(op2>op1)
        {
            return op2;
        }
      }else{
        return op3;
      }
      return 0;
}
public static void main(String[]args){
    diameter d=new diameter();

    d.root=new Node(1);
    d.root.left=new Node(2);
    d.root.right=new Node(3);
    d.root.left.left=new Node(4);
    d.root.right.right=new Node(5);
   
    System.out.println("hight is : "+d.gethight(d.root));
    
    System.out.println("diameter : "+d.getdiameter(d.root));


}
}