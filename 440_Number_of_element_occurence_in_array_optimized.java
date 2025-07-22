public class 440_Number_of_element_occurence_in_array_optimized {
    
      // this class contains used of very small methods //
    public static void main(String[] args) {
    Map<Integer,Integer>map=new HashMap<>();
    int arr[]={10,20,30,40,10,20};
    
     for(int i=0;i<arr.length;i++){
         map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
         
     }

     for(int num:map.keySet()){
        System.out.println(num+" "+map.get(num));
     }
 
    }


}
