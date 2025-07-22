public class 439_Replace_Element_with_greatest_element_on_Right_Side {
    
static int []solve(int arr[]){
    
        int mx=-1;
        int n=arr.length;
        int a;
        for(int i=n-1;i>=0;i--){
            a=arr[i];
            arr[i]=mx;
            mx=Math.max(mx,a);
        }
          
   //leetcode: 1299//
      return arr;
    }
    public static void main(String[] args) {
        //  int arr[]={16,17,4,3,5,2};
        int arr[]={17,18,5,4,6,1};
        //   ArrayList<Integer>list=solve(arr);
        //   for(int res:list){
        //      System.out.print(res+" ");
         // }
         //i/p:17,18,5,4,6,1

         //o/p:18,6,6,6,1,-1 
           // solve(arr);

           System.out.print(Arrays.toString(solve(arr)));
          
    }


}
