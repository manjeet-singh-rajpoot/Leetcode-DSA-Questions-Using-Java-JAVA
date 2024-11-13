import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
         this.data=data;
         this.left=null;
         this.right=null;
    }
}
class  hight{
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
        }
         else
        {
            return (right+1);
        }
       
    }
public static void main(String[]args){
    hight s=new hight();
    s.root=new Node(10);
    s.root.left=new Node(20);
    s.root.right=new Node(50);
    s.root.left.left=new Node(40);
    s.root.right.right=new Node(20);

    System.out.print("hight is : ");
    System.out.println(s.gethight(s.root));

}
}