import java.util.*;
public class  mistack{
  public static class Stack{
          int top[];
          int next[];
          int arr[];
          int n;
          int k;
          int free;
      Stack(int n1,int k1)
      {
           n=n1;
           k=k1;
          arr=new int[n];
          top=new int[k];
          next=new int[n];
          free=0;
        for(int i=0;i<k;i++)
        {
            top[i]=-1;
        }
       for(int i=0;i<n-1;i++)
          next[i]=i+1;
          next[n-1]=-1;
       
    }
  }
static void push(Stack s,int data,int sn)
{
      if(s.free==-1)
      {
         System.out.println("overflow");
      }else{
       int i=s.free;
       s.free=s.next[i];
       s.next[i]=s.top[sn];
       s.top[sn]=i;
       s.arr[i]=data;
      }
}
static int pop(Stack s,int sn)
{
     if(s.top[sn]==-1)
     {
        System.out.println("Underflow");
     }
         int i=s.top[sn];
         s.top[sn]=s.next[i];
         s.next[i]=s.free;
         s.free=i;
    return s.arr[i];
}
public static void main(String[]args){
    int k=3;
    int n=10;
    Stack s=new Stack(n,k);
    //1st stack//
     push(s,10,0);
     push(s,20,0);
     push(s,30,0);

     //2st stack//
      push(s,40,1);
     push(s,50,1);
     push(s,60,1);
 
      //3st stack//
    push(s,70,2);
    push(s,80,2);
    push(s,90,2);


    System.out.println("Poped element in stack 2: "+pop(s,2));
    System.out.println("Poped element  in stack 1: "+pop(s,1));
    System.out.println("Poped element  in stack 0: "+pop(s,0));
}
}