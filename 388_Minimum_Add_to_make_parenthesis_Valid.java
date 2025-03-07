
/*Question : 
 * 
 *    A parentheses string is valid if and only if:

It is the empty string,
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.

For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
Return the minimum number of moves required to make s valid.

 

Example 1:

Input: s = "())"
Output: 1
Example 2:

Input: s = "((("
Output: 3
 

Constraints:

1 <= s.length <= 1000
s[i] is either '(' or ')'.

 */
public class 388_Minimum_Add_to_make_parenthesis_Valid{
    public int minAddToMakeValid(String s) {
        int count1=0;
        int count2=0;
       for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                  count1++;
            }else if(s.charAt(i)==')' && count1 > 0){
                  count1--;
            }
            else {
                count2++;
            }
       }
   return count1+count2;
    }
}