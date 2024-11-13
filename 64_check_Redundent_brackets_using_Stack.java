import java.util.*;
import java.util.Stack;
public class Redundent{
static boolean check(String str)
{
     Stack<Character>s=new Stack<>();
   for(int i=0;i<str.length();i++)
   {
    char ch=str.charAt(i);
    if(ch=='(' || ch=='+' || ch=='-' || ch=='/' || ch=='*')
    {
          s.push(ch);
    }
    else{
          if(ch==')')
          {
              boolean Redunt=true;
              while(s.peek()!='(')
              {
                   char top=s.peek();
                   if(top=='+' || top=='-' || top=='/' || top=='*')
                   {
                       Redunt=false;
                   }
                   s.pop();
              }
            if(Redunt==true)
            {
                return true;
            }
            s.pop();
          }
    }
   }  
   return false;
}
public static void main(String[]args){
      String str="(2+2)";
       check(str);
     /* if(check(str))
      {
        System.out.print("Redundent true");
      }else{
        System.out.print("Redundent false");
      }
      */
}
}