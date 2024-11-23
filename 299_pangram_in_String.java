/*  Question : 

 Check if sentence is pangram:

          A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false
 
 * 
 * 
 */       //answer:


public class 299_pangram_in_String{
static boolean solve(String s){
     
    int arr[]=new int[26];
   
    for(int i=0;i<26;i++){
        arr[i]=0;
    }
   
    for(char ch:s.toCharArray()){
        int index=ch-'a';
        arr[index]++;
    }
        for(int count:arr){
            if(count==0){
                return false;
            }
        }
        return true;
}
    
    public static void main(String[] args) {
        String sent="thequickbrownfoxjumpsoverthelazydog";
        System.out.print(solve(sent));
    }
}
