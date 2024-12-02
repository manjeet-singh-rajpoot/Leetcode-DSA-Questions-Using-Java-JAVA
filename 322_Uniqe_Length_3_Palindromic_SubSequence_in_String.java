/*Question :

       Given a string s, return the number of unique palindromes of length three that are a subsequence of s.

Note that even if there are multiple ways to obtain the same subsequence, it is still only counted once.

A palindrome is a string that reads the same forwards and backwards.

A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

For example, "ace" is a subsequence of "abcde".
 

Example 1:

Input: s = "aabca"
Output: 3
Explanation: The 3 palindromic subsequences of length 3 are:
- "aba" (subsequence of "aabca")
- "aaa" (subsequence of "aabca")
- "aca" (subsequence of "aabca")
Example 2:

Input: s = "adc"
Output: 0
Explanation: There are no palindromic subsequences of length 3 in "adc".
Example 3:

Input: s = "bbcbaba"
Output: 4
Explanation: The 4 palindromic subsequences of length 3 are:
- "bbb" (subsequence of "bbcbaba")
- "bcb" (subsequence of "bbcbaba")
- "bab" (subsequence of "bbcbaba")
- "aba" (subsequence of "bbcbaba")
 

Constraints:

3 <= s.length <= 105
s consists of only lowercase English letters.
 * 
 * 
 *        Answer: 
 */

import java.util.*;
public class 322_Uniqe_Length_3_Palindromic_SubSequence_in_String{
   static int solve(String s){
       int n=s.length();

       Set<Character>set=new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(s.charAt(i));
        }
    int result=0;

    for(char letter:set){
          int left_idx=-1;
          int right_idx=-1;

          for(int i=0;i<n;i++){
             if(s.charAt(i)==letter){
                if(left_idx==-1){
                    left_idx=i;
                 }
               right_idx=i;
             }
          }
        
        Set<Character>st=new HashSet<>();

        for(int mid=left_idx+1;mid<=right_idx-1;mid++){
              st.add(s.charAt(mid));
        }
    
        result=result+st.size();
    } 
    return result;
   }
    public static void main(String[] args) {
        String s = "aabca";
        System.out.print(solve(s));
    }
}
