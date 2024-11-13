import java.util.*;

import org.w3c.dom.Node;
public class huffman{
public static class Node{
      Node left;
      Node right;
      char c;
      int data;
}
static class MyComarator implements Comparator<Node>{
    public int compare(Node x,Node y)
    {
       return (x.data-y.data);
    }
}
static void preorder(Node root,String s)
{
      if(root.left==null && root.right==null && Character.isLetter(root.c))
      {
         System.out.println(root.c+" "+s);
         return ;
      }

      preorder(root.left,s+"0");
      preorder(root.right, s+"1");
}
public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int n = 6; 
    char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' }; 
    int[] charfreq = { 5, 9, 12, 13, 16, 45 }; 

    PriorityQueue<Node>q=new PriorityQueue<Node>(n,new MyComarator());
      
    for(int i=0;i<n;i++)
    {
        Node hn=new Node();

        hn.c=charArray[i];
        hn.data=charfreq[i];
        hn.left=null;
        hn.right=null;

        q.add(hn);
    }

    Node root=null;

    while(q.size()>1)
    {
        Node x=q.peek();
        q.poll();

        Node y=q.peek();
        q.poll();

        Node f=new Node();

        f.data=x.data+y.data;

        f.c='-';

        f.left=x;
        f.right=y;

        root=f;

    q.add(f);
    }

    preorder(root, "");
}
}