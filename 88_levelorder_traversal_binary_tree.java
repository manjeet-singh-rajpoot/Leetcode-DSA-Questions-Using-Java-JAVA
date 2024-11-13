import java.util.*;
public class binarytree{
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
static  Queue<Node>q=new LinkedList<>();
static Node root;
static void levelorder()
{
         q.add(root);
    while(!q.isEmpty())
    {
         Node curr=q.poll();
         System.out.print(curr.data+" ");
        if(curr.left!=null)
        {
            q.add(curr.left);
        }
        if(curr.right!=null)
        {
            q.add(curr.right);
        }
    }
}
public static void main(String[]args){
    binarytree tree_level = new binarytree();
    tree_level.root = new Node(1);
    tree_level.root.left = new Node(2);
    tree_level.root.right = new Node(3);
    tree_level.root.left.left = new Node(4);
    tree_level.root.left.right = new Node(5);

    levelorder();
}
}