import java.util.*;
public class stac{
    public static class Stack{
        int arr[];
        int top;
        int size;
    Stack(int size)
    {
         this.size=size;
         this.top=-1;
         arr=new int[size];
    }
 }
 static boolean isempty(Stack s)
 {
      if(s.top==-1)
      {
        return true;
      }else{
        return false;
      }
 }
 static boolean isfull(Stack s)
 {
      if(s.top==s.size-1)
      {
           return true;
      }else{
        return false;
      }
 }
 static void push(Stack s,int data)
 {
      if(isfull(s))
      {
        System.out.println("overflow");
      }else{
           s.top++;
          s.arr[s.top]=data;
      }
 }
 static int pop(Stack s)
 {
     int a=-1;
      if(isempty(s))
      {
        System.out.println("Underflow");
      }
           a=s.arr[s.top];
           s.top--;
      return a;
 }
 static int peek(Stack s)
 {
      return s.arr[s.top];
 }
 
public static void main(String[]args){
    Stack s=new Stack(6);
    push(s,10);
    push(s,20);
    push(s,30);
    push(s,40);
   
    System.out.println(peek(s));
    pop(s);
    System.out.println(peek(s));
    pop(s);
    System.out.println(peek(s));
    pop(s);
    System.out.println(peek(s));
    pop(s);
    System.out.println();
    if(isempty(s))
    {
        System.out.println("Stasck is empty");
    }else{
        System.out.println("Stack is not empty");
    }
 
 
}
}