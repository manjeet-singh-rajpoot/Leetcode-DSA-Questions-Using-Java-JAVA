import java.util.*;
public class botom{
public static class Node{
    Node left;
    int data;
    Node right;
    Node(int data)
    {
        this.left=null;
        this.right=null;
        this.data=data;
    }
}
public static class Queueobj{
       Node node;
       int hd;
       Queueobj(Node node,int hd)
       {
        this.node=node;
        this.hd=hd;
       }
}
Node root;
static void bottomviews(Node node)
{
   Queue<Queueobj>q=new LinkedList<>();
   Map<Integer,Integer>map=new HashMap<>();
   int min=0;
   int max=0;

   q.add(new Queueobj(node,0));
   while(!q.isEmpty())
   {
    Queueobj curr=q.poll();
    map.put(curr.hd,curr.node.data);
    if(curr.node.left!=null)
    {
          min=Math.min(min,curr.hd-1);
          q.add(new Queueobj(curr.node.left,curr.hd-1));
    }
    if(curr.node.right!=null)
    {
        max=Math.max(max,curr.hd+1);
          q.add(new Queueobj(curr.node.right,curr.hd+1));
    }
   }
   for(; min<=max;min++)
   {
    System.out.println(map.get(min));
   }
}

public static void main(String[]args){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right= new Node(60);

        System.out.print("Answer is : ");
        
        bottomviews(root);
}
}