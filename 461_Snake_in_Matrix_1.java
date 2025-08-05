public class 461_Snake_in_Matrix_1 {

 static int solve(int gdize,List<String>commands){

      int r=0;
      int c=0;
      int n=commands.size();

      for(int i=0;i<n;i++){
           String command=commands.get(i);
        if(command.equals("LEFT")){
              c--;
        }else if(command.equals("RIGHT")){
              c++;
        }else if(command.equals("UP")){
              r--;
        }else if(command.equals("DOWN")){
              r++;
        }
      }

    return (r * gdize) + c;

 }
    
    public static void main(String[] args) {
        int n=2;
        List<String>list=new ArrayList<>();
        list.add("RIGHT");
        list.add("DOWN");

        System.out.print(solve(n,list));
    }
}

}
