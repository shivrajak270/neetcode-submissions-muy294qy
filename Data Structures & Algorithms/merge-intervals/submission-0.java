class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]>result=new ArrayList<>();
        result.add(intervals[0]);
        for (int[] temp : intervals) {
            int[] last = result.get(result.size() - 1);

            if(last[1]>=temp[0]){
                last[1]=Math.max(temp[1],last[1]);
            }
            else{
                result.add(temp);
            }
          }
          int[][] ans = result.toArray(new int[result.size()][]);
          return ans;





    }
}
