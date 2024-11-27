 /*Question :
       You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.

 

Example 1:

Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
Example 2:

Input: s = "textbook"
Output: false
Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.
 

Constraints:

2 <= s.length <= 1000
  *      
             Answer: 
  */


public class 305_DeterMine_if_string_Halve_are_Alike{

static boolean solve(String s){
    int n= s.length();
    int lw=0,rw=0;
    for(int i=0,j=(n/2);i<n/2 && j<n;i++,j++)
    {   
        char c= Character.toLowerCase(s.charAt(i));
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        lw++;
        char d= Character.toLowerCase(s.charAt(j));
        if(d=='a'||d=='e'||d=='i'||d=='o'||d=='u')
        rw++;

    }
    if(lw==rw)
    return true;
    return false;
}

    public static void main(String[] args) {
        //String  s = "book";
       String s = "textbook";
        System.out.print(solve(s));
    }
}
