/*Question:

    You are given a string s and a character c. Return the total number of 
substrings
 of s that start and end with c.

 

Example 1:

Input: s = "abada", c = "a"

Output: 6

Explanation: Substrings starting and ending with "a" are: "abada", "abada", "abada", "abada", "abada", "abada".

Example 2:

Input: s = "zzz", c = "z"

Output: 6

Explanation: There are a total of 6 substrings in s and all start and end with "z".

 

Constraints:

1 <= s.length <= 105
s and c consist only of lowercase English letters.
 * 
 * 
 */

public class 329_Count_Substring_Starting_ending_With_Given_Character{
    static long solve(String s,char c){
        int n=s.length();
         long count=0;
         long substring=0;

         for(char ch:s.toCharArray()){
             if(ch==c){
                substring =substring+(1+count);
                count++;
             }
         }
      
         return substring;
    }

    public static void main(String[] args) {
        String s = "abada";
        char c='a';
        System.out.print(solve(s,c));
    }
}
