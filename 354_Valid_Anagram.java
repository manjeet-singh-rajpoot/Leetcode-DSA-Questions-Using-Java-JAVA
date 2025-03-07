/*Question : 
 * 
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false

 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
 */

import java.util.Arrays;

public class 354_Valid_Anagram{
        public boolean isAnagram(String s, String t) {
        
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();


    Arrays.sort(a);
    Arrays.sort(b);

    return Arrays.equals(a,b);

    }
}
