//  Question : 

/*
 *    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */
public class 345_Valid_Parenthesis {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
       for(char c:s.toCharArray()){
             if(c=='(' || c=='[' || c=='{'){
                 st.push(c);
             }else if(st.isEmpty() || (c==')' && st.pop()!='(') || (c==']' && st.pop()!='[') || (c=='}' && st.pop()!='{') )
             {
               return false;
             }
       }
       return st.isEmpty();

   }
}
