/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {

        for(int i=0;i<intervals.size()-1;i++){
            int j=i+1;
            int start1=intervals.get(i).start;
            int end1=intervals.get(i).end;
            int start2=intervals.get(j).start;
            int end2=intervals.get(j).end;

            if(start2>start1){
            if(start2<end1)
              return false;
        }

            if(start2<start1){
            if(start2>end1)
              return false;
        }
        if(start1==start2 || end1==end2)
           return false;

        }
        return true;
        



    }
}
