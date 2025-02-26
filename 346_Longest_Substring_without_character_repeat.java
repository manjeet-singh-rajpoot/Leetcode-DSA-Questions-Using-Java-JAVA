/*  Question: 

       Given a string s, find the length of the longest 
substring
 without duplicate characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
 * 
 * 
 */


 class 346_Longest_Substring_without_character_repeat{
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxlength=0;
        Set<Character>set=new HashSet<>();

    for(int right=0;right<s.length();right++){
           if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxlength=Math.max(maxlength,right-left+1);
           }else{
                   while(set.contains(s.charAt(right))){
                       set.remove(s.charAt(left));
                       left++;
                   }
                set.add(s.charAt(right));
           }
    }

    return maxlength;



    }
}
