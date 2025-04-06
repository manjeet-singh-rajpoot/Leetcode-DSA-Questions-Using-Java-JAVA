
/*Question : 
 * 
 *    Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses substring.

 

Example 1:

Input: s = "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()".
Example 2:

Input: s = ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()".
Example 3:

Input: s = ""
Output: 0
 
 */
public class 415_Longest_Valid_Parenthesis {
        public int longestValidParentheses(String s) {
             Stack<Integer>st=new Stack<>();
             st.push(-1);
             int count=0;
             for(int i=0;i<s.length();i++){
                  if(s.charAt(i)=='('){
                     st.push(i);
                  }else{
                    st.pop();
                    if(st.isEmpty()){
                         st.push(i);
                    }else{
                        count=Math.max(count,i-st.peek());
                    }
                  }
             }
    
            return count;
    }
    }    

