import java.util.*;

public class right{
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
static void solve(Node root,Vector<Integer>ans,int level)
{
      if(root==null)
      {
        return ;
      }
      if(level==ans.size())
        {
         ans.add(root.data);
        }
      solve(root.right,ans,level+1);
      solve(root.left,ans,level+1);
}
static Vector<Integer>rightview(Node root)
{
    Vector<Integer>ans=new Vector<>();
    solve(root,ans,0);
    return ans;

}
public static void main(String[]args){
    Node root = new Node(10);
    root.left = new Node(20);
    root.right = new Node(30);
    root.left.left = new Node(40);
    root.left.right= new Node(60);

    System.out.print("Answer is : ");
    System.out.print(rightview(root));
}
}