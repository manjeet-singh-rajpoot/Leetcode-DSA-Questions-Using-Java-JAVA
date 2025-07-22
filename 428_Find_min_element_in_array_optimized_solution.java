import java.util.HashMap;
import java.util.Map;

public class 428_Find_min_element_in_array_optimized_solution {
static int solve(int arr[]){
     int min=Integer.MAX_VALUE;
    
     Map<Integer,Integer>map=new HashMap<>();
     for(int i=0;i<arr.length;i++){
        map.put(i, arr[i]);
     }
   int temp=map.get(0);
   for(int i=1;i<arr.length-1;i++){
     if(temp < map.get(i) ){
        min=temp;
     }else{
        temp=map.get(i);
     }
   }

     return min;
}
    public static void main(String[] args) {
         int arr[]={30,50,10,60,100,6};
         System.out.println(solve(arr));
    }
}