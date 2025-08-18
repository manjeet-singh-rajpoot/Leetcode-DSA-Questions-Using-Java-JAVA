import java.util.Arrays;
import java.util.Stack;

public class  474_Smallest_subsequence_of_distinct_character{
   static String solve(String s){
         
       int[] lastIndex = new int[26]; 
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] =i;
        }

        Stack<Character> stack = new Stack<>();
        boolean[] seen = new boolean[26]; 

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = c - 'a';

            if (seen[index]) continue;

            while (!stack.isEmpty() && 
                   c < stack.peek() && 
                   lastIndex[stack.peek() - 'a'] > i) {
                char removed = stack.pop();
                seen[removed - 'a'] = false;
            }

            stack.push(c);
            seen[index] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }

        return sb.toString();
    }    public static void main(String[] args) {
      // String s = "bcabc";
       String s="cbacdcbc";
       System.out.println(solve(s));
       //solve(s);
    }
}
