import java.io.*;
import java.util.*;
public class BinarySearchTree {
    class Node {
        int key;
        Node left, right;
 
        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }
 
    // Root of BST
 static  Node root;
 
    // Constructor
    BinarySearchTree()
     {
         root = null;
     }
 
    BinarySearchTree(int value) 
    {
         root = new Node(value); 
    }
 
    // This method mainly calls insertRec()
    void insert(int key) 
    {
         root = insertRec(root, key);
    }
    Node insertRec(Node root, int key)
    {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        else if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
        return root;
    }
 
    void inorder() { 
        inorderRec(root); 
    }
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }
    static void levelorder()
{
    Queue<Node>q=new LinkedList<>();
    q.add(root);
    while(!q.isEmpty())
    {
        Node curr=q.poll();
        if(curr==null){
           if(!q.isEmpty())
           {
            q.add(null);
            System.out.print("null");
           }
        }else{
        System.out.print(curr.key+" ");
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
}
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();
 
        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
 
        // Print inorder traversal of the BST
 System.out.println("levelorder: ");
        tree.inorder();
        System.out.println();
System.out.println("levelorder: ");
        tree.levelorder();
    }
}