public class 441_Number_of_Charcter_occurs_in_String {
    
      
    public static void main(String[] args) {
        String str="abbccd";
        Map<Character,Integer>map=new HashMap<>();
        str=str.toLowerCase();

        for(char c:str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(char ch:map.keySet()){
            System.out.println(ch+" "+map.get(ch));
        }

    }


}
