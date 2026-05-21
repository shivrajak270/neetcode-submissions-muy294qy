class Solution {

   
    public int maxProduct(int[] nums) {

        int sum=1;
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int left=0;
        int right=n-1;
        int sum1=1;
        int sum2=1;
        while(left<n && right>=0){
            sum1*=nums[left];
            sum2*=nums[right];
            max=Math.max(max,Math.max(sum1,sum2));
            if(sum1==0)
              sum1=1;

            if(sum2==0)
              sum2=1;

              left++;
              right--;
        }
        return max;

    }
}
