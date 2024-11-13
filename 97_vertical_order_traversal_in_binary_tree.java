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
class values{
   static int min;
   static int max;
}
public class vertical{
static Node root;
static values val=new values();

    static void  findminmax(Node node,values min,values max,int hd)
    {
           if(node==null)
           {
             return;
           }
        if(hd<min.min)
        {
            min.min=hd;
        }
       else if(hd>max.max)
        {
            max.max=hd;
        }
        findminmax(node.left,min,max,hd-1);
        findminmax(node.right,min,max,hd+1);
    }
  static void printverticalline(Node node,int linenumber,int hd)
  {
         if(node==null)
         {
            return;
         }
        if(hd==linenumber)
        {
            System.out.print(node.data+" ");
        }
        printverticalline(node.left,linenumber,hd-1);
        printverticalline(node.right,linenumber,hd+1);
  }
static void verticalorder(Node node)
{
     findminmax(node,val,val,0);

     for(int linenumber=val.min;linenumber<=val.max;linenumber++)
     {
        printverticalline(node,linenumber,0);
        System.out.println(" ");
     }

}
public static void main(String[]args){
    vertical tree=new vertical();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    tree.root.right.left = new Node(6);
    tree.root.right.right = new Node(7);
    tree.root.right.left.right = new Node(8);
    tree.root.right.right.right = new Node(9);
    System.out.println("ans is: ");
    
    verticalorder(tree.root);

}
}