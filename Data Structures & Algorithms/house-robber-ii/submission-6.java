class Solution {

    public int helper(int[]nums,int start,int end,int dp[]){
      if(start>end)
         return 0;   

      if(dp[start]!=-1)
         return dp[start];   

      int keep=nums[start]+helper(nums,start+2,end,dp);
      int skip=helper(nums,start+1,end,dp);

      return dp[start]=Math.max(keep,skip);
    }
    public int rob(int[] nums) {

  if(nums.length==1){
    return nums[0];
  }

  int[] dp1 = new int[nums.length];
        int[] dp2 = new int[nums.length];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);
  int u=helper(nums,0,nums.length-2,dp1);
  int y=helper(nums,1,nums.length-1,dp2);

  return Math.max(u,y);

        
    }
}
