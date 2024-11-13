import java.util.*;
import java.util.Stack;
public class match{
public static boolean matching(String str)
{
      Stack<Character>s=new Stack<>();

      //traversing//
    
 for(int i=0;i<str.length();i++)
 {
         char ch=str.charAt(i);
    
         if(ch=='(' || ch=='{' || ch=='[')
         {
             s.push(ch);
             continue;
         }
         if(s.empty())
         {
            return false;
         }
        char check;
        switch(ch)
        {
          case ')':
                     {
                          check=s.pop();
                          if(check=='{' || check=='[')
                        {
                          return false;
                        }
                            break;
                    }

     case ']':
         {
              check=s.pop();
            if(check=='{' || check=='(')
            {
                return false;
            }
            break;
         }
      case '}':
    {
              check=s.pop();
            if(check=='[' || check=='(')
            {
                return false;
            }
            break;
    }
 }
 }
 return (s.empty());

}
public static void main(String[]args){
    String str="{9+(8)*[7]}}";

    if(matching(str))
    {
        System.out.println("Matching");
    }
    else{
        System.out.println("Not Matching");
    }

}
}