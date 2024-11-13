import java.util.*;
public class maj{
public static class greedy{
     int d;
     char id;
     int p;
  public greedy(){}
     greedy(char id,int d,int p)
     {
        this.p=p;
        this.id=id;
        this.d=d;
     }
}
void printsheduling(ArrayList<greedy>arr,int t)
{
     int n=arr.size();
   
     Collections.sort(arr,(a, b) -> b.p - a.p);
   
     boolean result[]=new boolean[t];
      
     char job[]=new  char[t];
       
     for(int i=0;i<n;i++)
     {
      for(int j=Math.min((t-1),arr.get(i).d-1);j>=0;j--)
      {
          if(result[j]==false)
          {
             result[j]=true;
             job[j]=arr.get(i).id;
              break;
            }
      }
     }
    for (char jb : job)
     System.out.print(jb + " ");
 System.out.println();
}
public static void main(String[]args){
    ArrayList<greedy> arr = new ArrayList<greedy>();
    arr.add(new greedy('a', 2, 100));
    arr.add(new greedy('b', 1, 19));
    arr.add(new greedy('c', 2, 27));
    arr.add(new greedy('d', 1, 25));
    arr.add(new greedy('e', 3, 15));

    System.out.println(
        "Following is maximum profit sequence of jobs");

    maj job = new maj();

    // Function call
    job.printsheduling(arr, 3);
}
}