import java.util.*;
public class sum{
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
static void print(Vector<Integer>v,int i)
{
    for(int j=i;j<v.size();j++)
    {
        System.out.print(v.get(j)+" "+"\n");
    }
} 
static Vector<Integer>path=new Vector<>();
static void vectorpath(Node root,int k)
{
       if(root==null)
       {
        return ;
       }
     path.add(root.data);
     vectorpath(root.left,k);
     vectorpath(root.right,k);
     int f=0;
     for(int i=path.size()-1;i>=0;i--)
     {
         f=f+path.get(i);
         if(f==k)
         {
            print(path,i);
         }   
     }
     path.remove(path.size()-1);
}
static void printkpath(Node root,int k)
{
   path=new Vector<Integer>();
   vectorpath(root,k);
}
public static void main(String[]args){
    Node root = new Node(1);
    root.left = new Node(3);
    root.left.left = new Node(2);
    root.left.right = new Node(1);
    root.left.right.left = new Node(1);
    root.right = new Node(-1);
    root.right.left = new Node(4);
    root.right.left.left = new Node(1);
    root.right.left.right = new Node(2);
    root.right.right = new Node(5);
    root.right.right.right = new Node(2);

    int k = 5;
    printkpath(root, k);

}
}