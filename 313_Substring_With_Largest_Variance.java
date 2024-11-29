/*
 * 
 * The variance of a string is defined as the largest difference between the number of occurrences of any 2 characters present in the string. Note the two characters may or may not be the same.

Given a string s consisting of lowercase English letters only, return the largest variance possible among all substrings of s.

A substring is a contiguous sequence of characters within a string.
Question:
 

Example 1:

Input: s = "aababbb"
Output: 3
Explanation:
All possible variances along with their respective substrings are listed below:
- Variance 0 for substrings "a", "aa", "ab", "abab", "aababb", "ba", "b", "bb", and "bbb".
- Variance 1 for substrings "aab", "aba", "abb", "aabab", "ababb", "aababbb", and "bab".
- Variance 2 for substrings "aaba", "ababbb", "abbb", and "babb".
- Variance 3 for substring "babbb".
Since the largest possible variance is 3, we return it.
Example 2:

Input: s = "abcde"
Output: 0
Explanation:
No letter occurs more than once in s, so the variance of every substring is 0.
 

Constraints:

1 <= s.length <= 104
s consists of lowercase English letters.

        answer: 
 */

public class 313_Substring_With_Largest_Variance{
    public static int solve(String s){
       
        int result=0;
        for(char f='a';f<='z';f++){
            for(char se='a';se<='z';se++){
                 if(f!=se){
                    result=Math.max(result,kedane(s,f,se));
                 }
            }
        }
    return result;
    }
private static int kedane(String s,char a,char b){
    int ans=0;
    int f1=0;
    int f2=0;
   boolean visited=false;
        
     for(char c:s.toCharArray()){
          if(c!=a && c!=b){
            continue;
          }
          if(c==a){
            f1++;
          }else{
            f2++;
          }
        if(f2>0){
           ans=Math.max(ans,f1-f2);
        }else if(f2==0 && visited==true){
            ans=Math.max(ans,f1-1);
        }

        if(f2>f1){
            f1=0;
            f2=0;
            visited=true;
        }
     }
     return ans;
}
    public static void main(String[] args) {
        String s = "aababbb";
        System.out.print(solve(s));
    }
}
