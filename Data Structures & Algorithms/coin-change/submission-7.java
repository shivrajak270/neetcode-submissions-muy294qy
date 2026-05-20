class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];

        for(int i=1;i<amount+1;i++){
            dp[i]=Integer.MAX_VALUE;

            for(int j=0;j<coins.length;j++){
                int amount2=coins[j];
                int remaining_amount=i-amount2;
                if(i>=amount2 && dp[remaining_amount]<Integer.MAX_VALUE)
                dp[i]=Math.min(dp[i],1+dp[remaining_amount]);
            }
        }
        if(dp[amount]>amount)
           return -1;

        return dp[amount];   
        
    }
}
