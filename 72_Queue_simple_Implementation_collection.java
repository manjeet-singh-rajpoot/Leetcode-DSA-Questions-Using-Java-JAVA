import java.util.*;
import java.util.Queue;
import java.util.ArrayDeque;

public class queue{
public static void main(String[]args){
     Queue<Integer>q=new ArrayDeque<>();
         q.add(10);
         q.add(20);
         q.add(30);//push//
         q.add(40);
        
        System.out.print("Display : "+q);

        System.out.println();
       System.out.print("size: "+q.size());
       q.remove(10);
       q.remove(20);
       q.remove(30);
       q.remove(40);//pop//

       System.out.println();
       System.out.print("After remove: "+q);
}
}