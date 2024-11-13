import java.util.*;
public class stac{
    public static class Stack{
           int arr[];
           int top1;
           int top2;
           int size;
        Stack(int size)
        {
            this.top1=-1;
            this.size=size;
            this.top2=size;
            arr=new int[size];
        }
    }

static void push1(Stack s,int data)
{
     if(s.top2-s.top1>1)
     {
        s.top1++;
        s.arr[s.top1]=data;
     }
     else{
        System.out.println("Stack is overflow");
     }
}
static void push2(Stack s,int data)
{
     if(s.top2-s.top1>1)
     {
        s.top2--;
        s.arr[s.top2]=data;
     }
     else{
        System.out.println("Stack is overflow");
     }
}
static int pop1(Stack s)
{
     int a=-1;
      if(s.top1>=0)
      {
          a=s.arr[s.top1];
          s.top1--;
      }
      return -1;
}
static int pop2(Stack s)
{
     int a=-1;
      if(s.top2<=s.size)
      {
          a=s.arr[s.top2];
          s.top2++;
      }
      return -1;
}
public static void main(String[]args){
     Stack s=new Stack(6);
     push1(s,10);
     push1(s,20);
     push2(s,30);
     push2(s,44);

     System.out.println("poped "+pop1(s));
     
    
}
}