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
    public int minMeetingRooms(List<Interval> intervals) {
        int count=1;
     int start[]=new int[intervals.size()];
     int end[]=new int[intervals.size()];

        for(int i=0;i<intervals.size();i++){
          start[i]=intervals.get(i).start;
          end[i]=intervals.get(i).end;
        }

            Arrays.sort(start);
            Arrays.sort(end);

            int room=0;
            int i=0;
            int j=0;
            int maxrooms=0;


            while(i<intervals.size() && j<intervals.size()){
                if(start[i]<end[j]){
                    room++;
                    i++;
                }
                else{
                    room--;
                    j++;
                }
                maxrooms=Math.max(room,maxrooms);
            }
            return maxrooms;

    }

}
