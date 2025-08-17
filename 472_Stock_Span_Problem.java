import java.util.Stack;

public class 472_Stock_Span_Problem{
static int solve(int price){
     int span=1;
     Stack<int[]>st=new Stack<>();
     while(!st.isEmpty() && st.peek()[0] <= price){
         span=span+st.pop()[1];
     }
     st.push(new int[]{price,span});

     return span;
}
    public static void main(String[] args) {
        int arr[]={100,80,60,70,60,75,85};
        // for(int n1:arr){
        //     System.out.println(solve(n1));
        // }
        
    }
}