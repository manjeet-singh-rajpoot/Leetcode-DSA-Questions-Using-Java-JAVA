import java.util.*;
public class raj{
public static class greedy{
     int d;
     int id;
     int p;
  public greedy(){}
     greedy(int p,int id,int d)
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
      
     int job[]=new int[t];
       
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
    for (int jb : job)
     System.out.print(jb + " ");
 System.out.println();
}
public static void main(String[]args){
  ArrayList<greedy>arr=new ArrayList<>();
       arr.add(new greedy(40,3,1));
       arr.add(new greedy(30,4,1));
       arr.add(new greedy(20,1,4));
       arr.add(new greedy(10,2,1));
  
       raj r=new raj();
       System.out.println(
        "Following is maximum profit sequence of jobs");
    r.printsheduling(arr,4);
}
}