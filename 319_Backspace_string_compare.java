/*Question : - 
 *    Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 

Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
Example 2:

Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".
Example 3:

Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".
 

Constraints:

1 <= s.length, t.length <= 200
s and t only contain lowercase letters and '#' characters.
 
 * 
 */
public class 319_Backspace_string_compare{

    public static boolean solve(String s, String t) {
        int m=s.length();
        int n=t.length();

        int i=m-1;
        int j=n-1;

        int skip_s=0;
        int skip_t=0;

        while(i>=0 || j>=0){
            while(i>=0){
                 if(s.charAt(i)=='#'){
                    skip_s++;
                    i--;
                 }else if(skip_s>0){
                     skip_s--;
                     i--;
                 }else{
                    break;
                 }
            }
            while(j>=0){
            if(t.charAt(j)=='#'){
                skip_t++;
                j--;
            }else if(skip_t>0){
                skip_t--;
                j--;
            }else{
                break;
            }
            }
       char first=i<0 ? '$':s.charAt(i);
       char second=j<0 ? '$':t.charAt(j);
     
       if(first!=second){
          return false;
       }

       i--;
       j--;
        }
return true;

    }   
    public static void main(String[] args) {
       String s = "ab#c";
       String t = "ad#c";
   
       System.out.print(solve(s,t));

    }
}
