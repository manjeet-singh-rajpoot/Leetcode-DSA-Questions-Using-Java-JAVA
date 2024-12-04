/*Question:
 *     
 * Given a string word, compress it using the following algorithm:

Begin with an empty string comp. While word is not empty, use the following operation:
Remove a maximum length prefix of word made of a single character c repeating at most 9 times.
Append the length of the prefix followed by c to comp.
Return the string comp.

 

Example 1:

Input: word = "abcde"

Output: "1a1b1c1d1e"

Explanation:

Initially, comp = "". Apply the operation 5 times, choosing "a", "b", "c", "d", and "e" as the prefix in each operation.

For each prefix, append "1" followed by the character to comp.

Example 2:

Input: word = "aaaaaaaaaaaaaabb"

Output: "9a5a2b"

Explanation:

Initially, comp = "". Apply the operation 3 times, choosing "aaaaaaaaa", "aaaaa", and "bb" as the prefix in each operation.

For prefix "aaaaaaaaa", append "9" followed by "a" to comp.
For prefix "aaaaa", append "5" followed by "a" to comp.
For prefix "bb", append "2" followed by "b" to comp.
 
 *             
 * Answer:  
 */

public class 325_String_Comparison-iii{
static String solve(String s){
    int n=s.length();
       StringBuilder sb=new StringBuilder();
       int count=1;
       int i=1;

       while(i<n){
         
         if(count==9 || s.charAt(i)!=s.charAt(i-1)){
            sb.append(count).append(s.charAt(i-1));
            count=1;
            i++;
            continue;
         }
         if(s.charAt(i)==s.charAt(i-1)){
            count++;
            i++;
         }
       }

       return sb.append(count).append(s.charAt(n-1)).toString();
    }

    public static void main(String[] args) {
        String s = "abcde";

        System.out.print(solve(s));
    }
}
