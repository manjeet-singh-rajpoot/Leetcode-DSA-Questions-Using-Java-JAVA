import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class 475_Minimize_String_Length_After_removing_subsequence_character{
static int solve(String s){
    int count=0;
   Set<Character>set=new HashSet<>();

   for(int i=0;i<s.length();i++){
     set.add(s.charAt(i));
   }

   for(char ch:set){
      count++;
   }

    return count;
}
    public static void main(String[] args) {
        //String s="baadccab";
        String s="aaabc";
        System.out.println(solve(s));
    }
}