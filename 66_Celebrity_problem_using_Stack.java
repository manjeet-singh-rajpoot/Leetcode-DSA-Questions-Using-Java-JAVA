import java.util.*;
import java.util.Stack;
public class after{
static void findcelebrety(int arr[][])
{
    int n=arr.length;
    Stack<Integer>s=new Stack<>();
    for(int i=0;i<n;i++)
    {
        s.push(i);
    }
  while(s.size()>=2)
  {
    //  int a=s.peek();
     int a=s.pop();
      int b=s.peek();
      s.pop();
    
      if(arr[a][b]==1)
      {
        s.push(b);
      }else{
        s.push(a);
      }
  }
 // int pc=s.peek();
  int pc=s.pop();
  boolean ok=true;
 for(int i=0;i<arr.length;i++)
 {
     if(i!=pc)
     {
        if(arr[pc][i]==1 ||arr[i][pc]==0)
        {
            ok=false;
            break;
        }
     }
 }
 if(ok)
 {
    System.out.println("celebrity is "+pc);
 }else{
    System.out.println("none");
 }
}
public static void main(String[]args){
    int arr[][]= { {0, 0, 1, 0}, 
                   {0, 0, 1, 0}, 
                   {0, 0, 0, 0}, 
                   {0, 0, 1, 0} };
         findcelebrety(arr);
}
}