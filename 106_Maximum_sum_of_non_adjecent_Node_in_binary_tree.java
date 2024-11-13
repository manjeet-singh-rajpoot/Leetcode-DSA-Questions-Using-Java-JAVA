import java.util.*;
public class findsum{
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
static int sumofgrandchild(Node node,HashMap<Node,Integer>mp)
{
    int sum=0;
    if(node.left!=null)
    {
          sum=sum+getmaxsumutil(node.left.left,mp)+getmaxsumutil(node.left.right,mp);
    }
    if(node.right!=null)
    {
          sum=sum+getmaxsumutil(node.right.left,mp)+getmaxsumutil(node.right.right,mp);
    }
    return sum;
}
static int getmaxsumutil(Node node,HashMap<Node,Integer>mp)
{
      if(node==null)
      {
        return 0;
      }
      if(mp.containsKey(node))
      {
          return mp.get(node);
      }
      
      int include=node.data+sumofgrandchild(node,mp);
      int exclude=getmaxsumutil(node.left,mp)+getmaxsumutil(node.right,mp);
     
      mp.put(node,Math.max(include,exclude));

      return mp.get(node);
}   
static int getmaxsum(Node node)
{
    if(node==null)
    {
        return 0;
    }
    HashMap<Node,Integer>mp=new HashMap<>();
    return getmaxsumutil(node,mp);
}
public static void main(String[]args){
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.right.left = new Node(4);
    root.right.right = new Node(5);
    root.left.left = new Node(1);
    System.out.print(getmaxsum(root));

}
}