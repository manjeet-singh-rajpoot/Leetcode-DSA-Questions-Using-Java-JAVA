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
static ArrayList<Integer>treetoList(Node root,ArrayList<Integer>list)
{
         if(root==null)
         {
            return list;
         }
         treetoList(root.left,list);
        list.add(root.data);
         treetoList(root.right,list);

    return list;
      
}
static boolean twosum(Node root,int target)
{
     ArrayList<Integer>a1=new ArrayList<>();
     ArrayList<Integer>a2=treetoList(root,a1);

     int start=0;
     int end=a2.size()-1;

     while(start<end)
     {
          if(a2.get(start)+a2.get(end)==target)
          {
            System.out.print(a2.get(start)+"+" +a2.get(end));
            return true;
          }
          if(a2.get(start)+a2.get(end)>target)
          {
            end--;
          }
          if(a2.get(start)+a2.get(end)<target){
            start++;
          }
     }
     
      return false;
}
public static void main(String[]args){
    Node root=null;
    root=new Node(50);
    root.left=new Node(40);
    root.right=new Node(60);
    root.left.left=new Node(30);
    root.right.right=new Node(70);

    //inorder(root);
    int target=100;
  
System.out.println(twosum(root,target));
}
}