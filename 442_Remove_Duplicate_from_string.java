public class 442_Remove_Duplicate_from_string {
        
    public static void main(String[] args) {
        String str="cbacdcbc";
        Map<Character,Integer>map=new HashMap<>();
        Map<Integer,Character>ans=new HashMap<>();
        str=str.toLowerCase();
    for(char c:str.toCharArray()){
         map.put(c,map.getOrDefault(c, 0)+1);
    }
   
    for(char ch:map.keySet()){
         if(map.get(ch) >= 1){
              map.put(ch, map.get(ch)-map.get(ch)+1);
         }
    }
   int i=0;
    for(char val:map.keySet()){
         ans.put(i++,val);;
    }

    // for(int j=0;j<ans.size();j++){
    //      System.out.print(ans.get(j)+" ");
    // }

    String ans2="";

     for(int j=0;j<ans.size();j++){
         ans2+=ans.get(j);
     }

     System.out.println(ans2);
       

    }

}
