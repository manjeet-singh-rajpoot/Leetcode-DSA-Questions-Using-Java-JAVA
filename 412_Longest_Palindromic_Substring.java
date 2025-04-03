
/*
 * Question : 
 * 
 * Given a string s, return the longest palindromic substring in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 

Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.
Seen this question in a real interview before?
1/5
Yes
No
Accepted
3.7M
Submissions
10.5M
Acceptance Rate
35.4%
Topics
Companies
Hint 1
Hint 2
 * 
 * 
 */
import java.util.Scanner;

public class 412_Longest_Palindromic_Substring{
       
    public String longestPalindrome(String s) {

        if(s.length() < 2){
            return s;
        }
            StringBuilder sb=new StringBuilder();
           int left=0;
           int right=s.length()-1;
            
           while(left < right){
               if(s.charAt(left)==s.charAt(right)){
                   sb.append(s.substring(left, right+1));
               }
   
               left++;
               right--;
             
           }
   
         return sb.toString();
   
       }     
      
    public static void main(String[] args) {
        
        

    }
}
