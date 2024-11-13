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
public class traversal{
 static Node root;
     static void ZigZag(){
        if(root==null)
        {
            return;
        }
         Stack<Node>s1=new Stack<>();
         Stack<Node>s2=new Stack<>();
        
         s1.push(root);
         boolean leftToright=true;
       
         while(!s1.isEmpty())
         {
            Node node=s1.pop();

            System.out.print(node.data+" ");
        
            if(leftToright)
            {
                if(node.left!=null)
                {
                    s2.push(node.left);
                }
                if(node.right!=null)
                {
                    s2.push(node.right);
                }
            }
            else{
                 if(node.right!=null)
                 {
                    s2.push(node.right);
                 }
                 if(node.left!=null)
                 {
                    s2.push(node.left);
                 }
            }
            if(s1.isEmpty())
            {
                leftToright=!leftToright;
                Stack<Node>temp=s1;
                s1=s2;
                s2=temp;
            }
         }
     }
public static void main(String[]args){
    traversal s=new traversal();
    s.root=new Node(10);
    s.root.left=new Node(20);
    s.root.right=new Node(30);

    ZigZag();

}
}