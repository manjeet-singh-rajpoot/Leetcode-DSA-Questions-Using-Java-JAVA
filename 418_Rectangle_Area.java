/*
 * Question : 
 *    Given the coordinates of two rectilinear rectangles in a 2D plane, return the total area covered by the two rectangles.

The first rectangle is defined by its bottom-left corner (ax1, ay1) and its top-right corner (ax2, ay2).

The second rectangle is defined by its bottom-left corner (bx1, by1) and its top-right corner (bx2, by2).

 

Example 1:

Rectangle Area
Input: ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2
Output: 45
Example 2:

Input: ax1 = -2, ay1 = -2, ax2 = 2, ay2 = 2, bx1 = -2, by1 = -2, bx2 = 2, by2 = 2
Output: 16
 

Constraints:

-104 <= ax1 <= ax2 <= 104
-104 <= ay1 <= ay2 <= 104
-104 <= bx1 <= bx2 <= 104
-104 <= by1 <= by2 <= 104
Seen this question in a real interview before?
1/5
Yes
No
Accepted
245.3K
Submissions
520.7K
Acceptance Rate
47.1%
Topics
Companies
Similar Questions
 */

public class 418_Rectangle_Area {

        public int computeArea(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
            
        int x5=Math.max(x1,x3);
        int y5=Math.max(y1,y3);
     
        int x6=Math.min(x2, x4);
        int y6=Math.min(y2, y4);
        boolean flag=true;
        if (x5 > x6 || y5 > y6) 
            flag=false;
    
        int area1=(x2-x1)*(y2-y1);
        int area2=(x4-x3)*(y4-y3);
    
        int ans=area1+area2;
        if(flag)
        ans-=(x6-x5)*(y6-y5);
    
        return ans;
        }
    }

