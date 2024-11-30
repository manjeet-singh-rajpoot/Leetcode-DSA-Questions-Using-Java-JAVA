/*  Question : Remove duplicate letter and return lexicographical order

Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is 
the smallest in lexicographical order
 among all possible results.

 

Example 1:

Input: s = "bcabc"
Output: "abc"
Example 2:

Input: s = "cbacdcbc"
Output: "acdb"
 

Constraints:

1 <= s.length <= 104
s consists of lowercase English letters.
 

Note: This question is the same as 1081: https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/
 * 
 * 
 *         Answer: 
 */

import java.util.*;
public class 316_Remove_Duplicate_Letter{
    static String solve(String s){

           int n=s.length();
        int lastindex[]=new int[26];
        
           for(int i=0;i<n;i++){
                  char ch=s.charAt(i);
                 lastindex[ch-'a']=i;
               }
          boolean visited[]=new boolean[26];
          Stack<Character>stack=new Stack<>();
      
           for(int i=0;i<n;i++){
               int idx=s.charAt(i)-'a';
                
               if(visited[idx]==true){
                  continue;
               }

               while(!stack.isEmpty()  && stack.peek()>s.charAt(i) && lastindex[stack.peek()-'a']>i){
                    visited[stack.pop()-'a']=false;
               }

                 stack.push(s.charAt(i));
                 visited[idx]=true;
           }

           StringBuilder result=new StringBuilder();

           while(!stack.isEmpty()){
                result.append(stack.pop());

           }

           return result.reverse().toString();

        }

    public static void main(String[] args) {
        String s="bcabc";
        System.out.print(solve(s));
    }
}
