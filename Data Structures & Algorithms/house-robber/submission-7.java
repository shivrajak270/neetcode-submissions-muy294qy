class Solution {

    public int helper(int[]nums,int i,int l,int dp[]){
        if(i>l)
          return 0;

        if(dp[i]!=-1){
            return dp[i];
        }  

        int takeone=nums[i]+helper(nums,i+2,l,dp);
        int dont=helper(nums,i+1,l,dp);  

        return dp[i]=Math.max(takeone,dont);
    }
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp, -1);
        return helper(nums,0,nums.length-1,dp);
    }
}
