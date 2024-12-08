/*Question 
 * You are given two strings of the same length s and t. In one step you can choose any character of t and replace it with another character.

Return the minimum number of steps to make t an anagram of s.

An Anagram of a string is a string that contains the same characters with a different (or the same) ordering.

 

Example 1:

Input: s = "bab", t = "aba"
Output: 1
Explanation: Replace the first 'a' in t with b, t = "bba" which is anagram of s.
Example 2:

Input: s = "leetcode", t = "practice"
Output: 5
Explanation: Replace 'p', 'r', 'a', 'i' and 'c' from t with proper characters to make t anagram of s.
Example 3:

Input: s = "anagram", t = "mangaar"
Output: 0
Explanation: "anagram" and "mangaar" are anagrams. 
 

Constraints:

1 <= s.length <= 5 * 104
s.length == t.length
s and t consist of lowercase English letters only.

 * 
 *    Answer:
 */

public class 332_Minimum_Number_of_Step_To_Make_String_Anagram{
    static int solve(String s,String t){
        int m=s.length();
        int n=t.length();
        int result=0;

        int count_s[]=new int[26];

        for(char ch:s.toCharArray()){
            count_s[ch-'a']++;
        }

        int count_t[]=new int[26];
        
        for(char ch:t.toCharArray()){
            count_t[ch-'a']++;
        }

        for(int i=0;i<26;i++){
            if(count_s[i]>count_t[i]){
                result+=count_s[i]-count_t[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "bab", t = "aba";
        System.out.print(solve(s,t));
    }
}
