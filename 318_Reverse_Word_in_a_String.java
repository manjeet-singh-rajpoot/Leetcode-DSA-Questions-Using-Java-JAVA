/*Question:- 

    Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 

Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "Mr Ding"
Output: "rM gniD"
 

Constraints:

1 <= s.length <= 5 * 104
s contains printable ASCII characters.
s does not contain any leading or trailing spaces.
There is at least one word in s.
All the words in s are separated by a single space.
 * 
 * 
 *     Answer: 
 */
public class 318_Reverse_Word_in_a_String{
    static String solve(String s){
         int n=s.length();
        
         char result[]=s.toCharArray();

         for(int i=0;i<n;i++){
             if(result[i]!=' '){
                int j=i;
                
                while(j+1<n && result[j+1]!=' '){
                    j++;
                }

                reverse(result,i,j);
                 
                i=j;
             }
         }
         return new String(result);
    }
    static void reverse(char result[],int i,int j){
        while(i<j){
        char temp=result[i];
        result[i]=result[j];
        result[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        System.out.print(solve(s));
    }
}
