class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

   List<int[]> temp = new ArrayList<>(Arrays.asList(intervals));
   temp.sort((a,b)->Integer.compare(a[0],b[0]));
 


int prev = temp.get(0)[1];
int count=0;

for (int j = 1; j < temp.size(); j++) {

    if (temp.get(j)[0] < prev) {
        count++;
        prev = Math.min(prev, temp.get(j)[1]);
    } else {
        prev = temp.get(j)[1];
    }
}
return count;
        
    }
}
