                      //mistack//
import java.util.*;
public class midle{
static int maxArearactangleinhistrogram(int arr[])
{
    int n=arr.length;
    int ns[]=nextsmallest(arr,n);
    int ps[]=checkprev(arr,n);
    int  maxans=0;
    for(int i=0;i<n;i++)
    {
        int curr=(ns[i]-ps[i]-1)*arr[i];
        maxans=Math.max(maxans,curr);          //Mistack//
    }
   System.out.println(maxans);
    return maxans;
}
static int[] nextsmallest(int arr[],int n)
{
    Stack<Integer>s=new Stack<>();
    s.push(-1);
    int ans[]=new int[n];
    for(int i=n-1;i>=0;i--)
    {
        int curr=arr[i];
       while(!s.empty() && s.peek()>=curr)
       {
          s.pop();
       }
     ans[i]=s.peek();
     s.push(curr);
    }
 
 return ans;
}
static int[] checkprev(int arr[],int n)
{
     Stack<Integer>s=new Stack<>();
     s.push(-1);
     int ans[]=new int[n];
    for(int i=0;i<n;i++)
    {
          int curr=arr[i];
        while(!s.empty() && s.peek()>=curr)
        {
             s.pop();
        }
        ans[i]=s.peek();
        s.push(curr);
    }   
   
    return ans;
}
/* 
static int maxractanglesubmatrix(int arr[][])
{
      int currrow[]=arr[0];
      int maxans=maxArearactangle(currrow);  
      for(int i=1;i<arr.length;i++)
      {
          for(int j=0;j<arr[0].length;i++)
          {
              if(arr[i][j]==1)
              {
                currrow[j]+=1;
              }else{
                currrow[j]=0;
              }
          }
         // int currans=maxArearactangle(currrow);
         // maxans=Math.max(maxans,currans);
        }
      return maxans;
        
}
*/
static int maxRectangle(int R, int C, int arr[][]) 
    { 
        // Calculate area for first row and initialize it as 
        // result 
        int result = maxArearactangleinhistrogram(arr[0]); 
  
        // iterate over row to find maximum rectangular area 
        // considering each row as histogram 
        for (int i = 1; i < R; i++) { 
  
            for (int j = 0; j < C; j++) 
                 {
                // if A[i][j] is 1 then add A[i -1][j] 
                if (arr[i][j] == 1) 
                {
                   arr[i][j] +=arr[i - 1][j]; 
                 }
         }
            // Update result if area with current row (as 
            // last row of rectangle) is more 
            result = Math.max(result,maxArearactangleinhistrogram(arr[i])); 
        } 
  
        return result; 
    } 
  
public static void main(String[]args){
    int R=4;
    int C=4;
    int arr[][]=
    {
        {0,1,1,0},
        {1,1,1,1},
        {1,1,1,1},
        {1,1,0,0}
    };
    System.out.print("Maximum ractangle in sub matrix: "+maxRectangle(R,C,arr));
}
}