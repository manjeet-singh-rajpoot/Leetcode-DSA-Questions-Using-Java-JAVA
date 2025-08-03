import java.util.ArrayList;
import java.util.List;

public class 458_Spiral_Traversal_of_a_Matrix{
    static List<Integer> solve(int arr[][]){
          int rs=0;
          int re=arr.length-1;
          int cs=0;
          int ce=arr[0].length-1;
      List<Integer>ans=new ArrayList<>();
          while(rs <= re && cs <= ce){

               for(int i=cs;i<=ce;i++){ 
                   ans.add(arr[rs][i]);
               }

               rs++;
              for(int i=rs;i<=re;i++){
                 ans.add(arr[i][ce]);
              }
              ce--;
            if(rs <= re){
                for(int i=ce;i>=cs;i--){
                    ans.add(arr[re][i]);
                }
            }
            re--;
            if(cs<=ce){
                for(int i=re;i>=rs;i--){
                    ans.add(arr[i][cs]);
                }
            }
            cs++;
          }

        return ans;

    }
    public static void main(String[] args) {
          int arr[][]={
                     {1,2,3},
                     {4,5,6},
                     {7,8,9}
                    };
        List<Integer>a=solve(arr);
        for(int n:a){
            System.out.print(n+" ");
        }
    }
}
