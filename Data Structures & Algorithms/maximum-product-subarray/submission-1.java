class Solution {

   
    public int maxProduct(int[] nums) {

        int sum=1;
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum=1;
           for(int j=i;j<n;j++){
            sum*=nums[j];
                max=Math.max(max,sum);
           }
         
        }
        return max;
    }
}
