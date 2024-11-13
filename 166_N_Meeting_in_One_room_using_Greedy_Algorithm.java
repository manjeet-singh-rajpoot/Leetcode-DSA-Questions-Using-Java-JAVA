import java.util.*;
public class raj{
   public static class Meeting{
       int start;
       int end;
    Meeting(int s,int e)
    {
        this.start=s;
        this.end=e;
    }
}
static void sortMeetings(Meeting[] meeting)
  {
        for(int i=0;i<meeting.length-1;i++)
        {
             for(int j=0;j<meeting.length-i-1;i++)
             {
                   if(meeting[j].end>meeting[j+1].end)
                   {
                        Meeting temp=meeting[j];
                        meeting[j]=meeting[j+1];
                        meeting[j+1]=temp;
                   }
             }
        }
  }  
static void scheduleMeetings(Meeting meeting[])
{
      System.out.println("Meeting ("+meeting[0].start+","+meeting[0].end+")");

      int Lastendtime=meeting[0].end;

      for(int i=0;i<meeting.length;i++)
      {
            if(meeting[i].start>=Lastendtime)
            {
               System.out.println("Metting  ("+meeting[i].start+","+meeting[i].end+")");
               Lastendtime=meeting[i].end;
            }
      }
}
public static void main(String[]args){
    Meeting[] meetings = {
        new Meeting(1, 3),
        new Meeting(2, 4),
        new Meeting(5, 8),
        // Add more meetings as needed
    };

    // Sort the meetings by their end time
    sortMeetings(meetings);

    // Schedule the meetings using the greedy algorithm
    scheduleMeetings(meetings);
}

}
