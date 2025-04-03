
/*
 * Question : 
 *  
 *    Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:

'.' Matches any single character.​​​​
'*' Matches zero or more of the preceding element.
The matching should cover the entire input string (not partial).

 

Example 1:

Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".
Example 2:

Input: s = "aa", p = "a*"
Output: true
Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
Example 3:

Input: s = "ab", p = ".*"
Output: true
Explanation: ".*" means "zero or more (*) of any character (.)".
 

Constraints:

1 <= s.length <= 20
1 <= p.length <= 20
s contains only lowercase English letters.
p contains only lowercase English letters, '.', and '*'.
It is guaranteed for each appearance of the character '*', there will be a previous valid character to match.
 */

public class 413_Match_Regular_Expression{
    public boolean isMatch(String s, String p) {
        return isMatch(0,s,0,p);
    }
    private boolean isMatch(int i, String s, int j, String p) { 
        int sn = s.length(), pn = p.length();
        if(j==pn) { // since * in p can match 0 of previous char, so empty string(i==sn) may match p
            return i==sn;    
        }
        char pj = p.charAt(j);
        if(j+1<pn && p.charAt(j+1)=='*') { //match *, needs to look at the next char to repeate current char
            if(isMatch(i,s,j+2,p)) {
                return true;
            }
            while(i<sn && (pj == '.'||pj==s.charAt(i))) {
                if(isMatch(++i,s,j+2,p)) {
                    return true;
                }
            }
        } else if(i<sn && (s.charAt(i) == pj ||    //match char
                   pj=='.')) {              //match dot
            return isMatch(i+1, s, j+1, p);
        }
        return false;

            
    }
}