import java.util.*;
public class topview{
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
static void topviews(Node node)
{
   Queue<Queueobj>q=new LinkedList<>();
   Map<Integer,Integer>map=new HashMap<>();
   int min=0;
   int max=0;

   q.add(new Queueobj(node,0));
   while(!q.isEmpty())
   {
    Queueobj curr=q.poll();
    if(!map.containsKey(curr.hd))
    {
      map.put(curr.hd,curr.node.data);
    }
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
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);

        System.out.print("Answer is : ");
        topviews(root);
}
}