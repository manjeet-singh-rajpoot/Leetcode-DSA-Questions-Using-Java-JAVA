/*
 * Question : 
 *   Given two integer arrays pushed and popped each with distinct values, return true if this could have been the result of a sequence of push and pop operations on an initially empty stack, or false otherwise.

 

Example 1:

Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
Output: true
Explanation: We might do the following sequence:
push(1), push(2), push(3), push(4),
pop() -> 4,
push(5),
pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
Example 2:

Input: pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
Output: false
Explanation: 1 cannot be popped before 2.
 
 */
import java.util.*;
public class 371_Valid_Stack_Suquence{
 static boolean solve(int push[],int pop[]){
 
    Stack<Integer>st=new Stack<>();
   int j=0;
    for(int val:push){
        st.push(val);
      while(!st.isEmpty() && st.peek()==pop[j]){
        st.pop();
        j++;
      }        
  
    }
return st.isEmpty();
   
 }
    public static void main(String[] args) {
        int push[]={1,2,3,4,5};
        int pop[]={4,3,5,1,2};
        System.out.print(solve(push,pop));
    }
}
