class Solution {
    public int maxArea(int[] heights) {
        int max=Integer.MIN_VALUE;

        for(int i=0;i<heights.length-1;i++){
            for(int j=i+1;j<heights.length;j++){
                int total=(j-i)*Math.min(heights[i],heights[j]);
                max=Math.max(total,max);
            }

        }
         return max;


        
    }
}
