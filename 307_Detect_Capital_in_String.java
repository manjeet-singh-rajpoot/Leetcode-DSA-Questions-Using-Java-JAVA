/*Question: 

    We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.

 

Example 1:

Input: word = "USA"
Output: true
Example 2:

Input: word = "FlaG"
Output: false
 

Constraints:

1 <= word.length <= 100
word consists of lowercase and uppercase English letters.

 * 
 *      Answer:  
 * 
 */

public class 307_Detect_Capital_in_String{
static boolean allcapital(String w){
    for(char ch:w.toCharArray()){
          if(ch<'A' || ch>'Z'){
            return false;
          }
    }
    return true;
}
static boolean allsmall(String w){
      for(char ch:w.toCharArray()){
          if(ch<'a' || ch>'z'){
            return false;
          }
      }
      return true;
}
static boolean solve(String w){
     if(allcapital(w) || allsmall(w) || allsmall(w.substring(1))){
         return true;
     }
     return false;
}
    
    public static void main(String[] args) {
        String w="USa";
        System.out.print(solve(w));
    }
}
