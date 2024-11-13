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
public class  sum{
    static Node root;
    static int sum(Node node)
    {
        if(node==null)
        {
            return 0;
        }
          return (sum(node.left)+sum(node.right)+node.data);
    }
    static int issum(Node node)
    {
         if(node==null || (node.left==null && node.right==null))
         {
            return 1;
         }
         int left=sum(node.left);
         int right=sum(node.right);
          
         if((node.data==left+right) && issum(node.left)!=0 && issum(node.right)!=0)
         {
            return 1;
         }else{
            return 0;
         }

    }
public static void main(String[]args){
    sum s=new sum();
    s.root=new Node(30);
    s.root.left=new Node(10);
    s.root.right=new Node(20);
   
    if(issum(s.root)!=0)
    {
        System.out.println("it is sumtree..");
    }
    else{
        System.out.println("it is not sumtree..");
    }

}
}