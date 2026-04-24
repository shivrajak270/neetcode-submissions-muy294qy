class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int i=0;
        int j=0;
        int result[][]=new int[intervals.length+1][2];

        while(i<intervals.length && intervals[i][1]<newInterval[0]){
            result[j]=intervals[i];
            j++;
            i++;
        }
        while(i<intervals.length  && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
       result[j] = new int[]{newInterval[0], newInterval[1]};
        j++;

        while(i<intervals.length){
            result[j]=intervals[i];
            j++;
            i++;
        }
        return java.util.Arrays.copyOf(result, j);

    

        
    }
}
