public class 427_Find_Max_Element_in_Array_using_HashMap {
          //Find maximum and minimum in an array :- Time complexity: O(n)// 
          //hashMap// 
static int solve(int arr[]){
       
    int max=0;

    Map<Integer,Integer>map=new HashMap<>();

    for(int i=0;i<arr.length;i++){
         map.put(i, arr[i]);
    }

    int temp=map.get(0);

    for(int i=1;i<map.size();i++){
         if(temp > map.get(i)){
             max=temp;
         }else{
            temp=map.get(i);
         }
    }
    return max;
}
public static void main(String[] args) {
        int arr[]={80,100,40,90,10};
        System.out.println(solve(arr));       
    }
}

