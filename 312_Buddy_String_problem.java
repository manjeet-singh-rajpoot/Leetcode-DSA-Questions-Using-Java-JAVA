/*Question: 

     Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.

Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].

For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
 

Example 1:

Input: s = "ab", goal = "ba"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.
Example 2:

Input: s = "ab", goal = "ab"
Output: false
Explanation: The only letters you can swap are s[0] = 'a' and s[1] = 'b', which results in "ba" != goal.
Example 3:

Input: s = "aa", goal = "aa"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.
 
 * 
 * 
 */


import java.util.*;
class 312_Buddy_String_problem{
    public static boolean buddyStrings(String A, String B) {
            if(A.length()!=B.length()){
                return false;
            } 

            if(A.equals(B)) // when a ki length and B ke string ki length are same 
            {
                // when a,b... has more than one frequency //
                Set<Character>set=new HashSet();
                   for(char ch:A.toCharArray()){
                       if(set.contains(ch)){
                        return true;
                       }else{
                           set.add(ch);
                       }
                   }    
                      //When  a and b are different that mean  a and b has no frequency //
                      
            }else{
               List<Integer>list=new ArrayList<>();
                        // we have to find the first 2 index  of string 
                  for(int i=0;i<A.length();i++){
                    //when first two string are diffrent exa-: "ab" == "ba"   true;
                       if(A.charAt(i)!=B.charAt(i)){
                           //add index into list 
                           list.add(i);
                       }
                  }
        return list.size()==2 && A.charAt(list.get(0)) ==B.charAt(list.get(1)) &&
                        A.charAt(list.get(1))==B.charAt(list.get(0));
            }
        
            return false;  
    }
public static void main(String[] args) {
   String s = "ab";
   String goal = "ba";

   System.out.print(buddyStrings(s,goal));
}
}