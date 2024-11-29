/* Question: issubsequence: 

      Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false
 

Constraints:

0 <= s.length <= 100
0 <= t.length <= 104
s and t consist only of lowercase English letters.
 
 * 
 * 
 */

public class 315_isSubSequence_in_String{
    public boolean isSubsequence(String s, String t) {
        int m=s.length();
        int n=t.length();
         int i=0;
         int j=0;
        while(i<m && j<n){
            if(s.charAt(i)==t.charAt(j)){
               i++;
            }
            j++;
        } 
        if(i==m){
           return true;
        }

     return false;
 }
    public static void main(String args[]){
        String s="abc";
        String t="ahbgdc";

        System.out.print(solve(s,t));
    }
}