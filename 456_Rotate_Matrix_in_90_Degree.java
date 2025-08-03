public class 456_Rotate_Matrix_in_90_Degree{
    static int[][] solve(int arr[][]){
        int row=arr.length;
        //int col=arr[0].length;

        for(int i=0;i<row;i++){
            for(int j=i;j<row;j++){
               int temp=arr[i][j];
               arr[i][j]=arr[j][i];
               arr[j][i]=temp;
            }
        }

        for(int i=0;i<row;i++){
            int j=0;
            int k=row-1;
            while(j<k){
               int temp=arr[i][j];
               arr[i][j]=arr[i][k];
               arr[i][k]=temp;
                j++;
                k--;
            }
        }

    return arr;

    }
     public static void main(String[] args) {
        int arr[][]={
                     {1,2,3},
                     {4,5,6},
                     {7,8,9}
                    };
        int mat[][]=solve(arr);
        for(int n1[]:mat){
            for(int n2:n1){
                System.out.print(n2+" ");
            }
            System.out.println();
        }
     }

}
