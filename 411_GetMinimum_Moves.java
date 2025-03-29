/*
 * 
 */

import java.util.*;
public class 411_GetMinimum_Moves{
 static int solve(String s){

int up=0 ,down=0,left=0,right=0;
     
for(char c:s.toCharArray()){
      switch(c){
           case 'U':{
               up++;
               break;
           }
           case 'D':
           {
               down++;
               break;
           }
           case 'L':{
               left++;
               break;
           }
           case 'R':{
               right++;
               break;
           }
      }
}
int vc=Math.min(up,down);
int hc=Math.min(left,right);
      
      return (vc*2)+(hc*2);
 }
    public static void main(String[] args) {
       String s="RUDRL";
       System.out.print(solve(s));

    }
}
