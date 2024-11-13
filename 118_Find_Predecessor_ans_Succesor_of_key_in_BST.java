import java.util.*;
public class maj{
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
static Node pre;
static Node succ;
static Node root;

static void predecessor(Node root,int key)
{
       if(root==null)
       {
        return ;
       }
    //find key 
    if(root.data==key)
    {
        if(root.left!=null)
        {
           Node temp=root.left;
          while(temp.right!=null)
          {
              temp=temp.right;
          }
          pre=temp;
        }

        if(root.right!=null)
        {
             Node temp=root.right;
             while(temp.left!=null)
             {
                 temp=temp.left;
             } 
            succ=temp;
        }
        return;
    }

    if(key<root.data)
    {
        succ=root;
        predecessor(root.left,key);
    }
    if(key>root.data)
    {
        pre=root;
        predecessor(root.right,key);
    }
    return ;
}
public static void main(String[]args){
    Node root=null;
    root=new Node(50);
    root.left=new Node(40);
    root.right=new Node(60);
    root.left.left=new Node(30);
    root.right.right=new Node(70);

    int key=40;

    predecessor(root,key);

    pre=succ=null;

    predecessor(root,key);
    if(pre!=null)
    {
        System.out.print("predessor : "+pre.data+" ");
    }
    else{
        System.out.print("no");
    }
    if(succ!=null)
    {
        System.out.print("succesor: "+succ.data+" ");
    }else{
        System.out.print("no");
    }

}
}