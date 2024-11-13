import java.util.*;
public class repeat{
static void repeat(String str)
{
    final int MAX_CHAR = 26;
      int count[]=new int[MAX_CHAR];
       Queue<Character>q=new LinkedList<>();
    for(int i=0;i<str.length();i++)
    {
         char ch=str.charAt(i);
         q.add(ch);
         count[ch-'a']++;
         while(!q.isEmpty())
         {
             if(count[q.peek()-'a']>1)
             {
                 //repeated charecter//
                q.remove();
             }else{
                //non repeated charecter//
                System.out.print(q.peek());
                 break;
             }
         }
         if(q.isEmpty())
         {
           System.out.print("#");
         }
    }
   System.out.println();
}
public static void main(String[]args){
      String str="aabc";
       repeat(str);

}
}