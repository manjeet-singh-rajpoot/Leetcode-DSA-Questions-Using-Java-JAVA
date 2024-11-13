import java.util.*;
import java.util.Stack;
public class stac{
public static void main(String[]args){
    Stack<Integer>s=new Stack<>();
      s.push(10);
      s.push(20);
      s.push(30);
      s.push(40);
      s.push(50);
      s.push(60);
      s.push(70);
     // s.pop();
       
     //stack is empty or not//
   if(s.empty())
   {
    System.out.println("stack is empty");
   }else{
    System.out.println("stack is Not empty");
   }
   
   //it returns top elemnt//
   System.out.println("peeks : "+s.peek());
   
   //printing all element //
   System.out.print("push Elements are : "+s+" ");

   //pop elements //
   s.pop();
   System.out.println();
   System.out.print("pops Elements are : "+s+" ");

   //size of stack //
   System.out.println();
System.out.print("stack Size are : "+s.size());

    //search elemnt //
System.out.println();
System.out.println("search elemtn index : "+s.search(20));

}
}