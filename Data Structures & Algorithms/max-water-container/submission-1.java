class Solution {
    public int maxArea(int[] heights) {
        int max=Integer.MIN_VALUE;
        int left=0;
        int right=heights.length-1;

      while(left<right){
           max=Math.max(max,Math.min(heights[right],heights[left])*(right-left));

           if(heights[left]<=heights[right] && left <right){
            left++;
           }
           else{
            right--;
           }
      }
             return max;

      }
       
    }

