/*Question:   
 * 
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
 */
import java.util.*;
public class 366_Valid_palindrom_in_String{
    static boolean solve(String s){
          s=s.toLowerCase().replaceAll("[^a-z0-9]", "");
          int left=0;
          int right=s.length()-1;

          while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
          }

          return true;
        
    }
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.print(solve(s));
    }
}
