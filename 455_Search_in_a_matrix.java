
public class 455_Search_in_a_matrix {
    static boolean solve(int arr[][],int t){
          int row=arr.length;
          int col=arr[0].length;

          int low=0;
          int high=(row * col) -1;
          int mid=0;

          while(low <= high){
              mid=low + (high-low)/2;
              int i=mid / col; // 2/4=1/2
              int j=mid % col;  // 2 %4=
              if(t==arr[i][j]){
                  return true;
              }else if(t < arr[i][j]){
                  high=mid-1;
              }else{
                low=mid+1;
              }
            
          }
return false;

        } 
    public static void main(String[] args) {
         int arr[][]={
                     {1,3,5,7},
                     {10,11,16,20},
                     {23,30,34,60}
                    };
        int target=3;
        System.out.println(solve(arr,target));
    }
}
