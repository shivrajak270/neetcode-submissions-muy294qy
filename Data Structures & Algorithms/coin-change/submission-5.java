class Solution {

    public int ans(int []coins,int amount,int sum,int total_coins,int i){
         if(sum==amount){
            return total_coins;
        }
        int n=coins.length;
         if(i>n-1){
           return Integer.MAX_VALUE;
        }
         if(sum>amount)
            return Integer.MAX_VALUE;
        int nextsum=sum+coins[i];
        int consider=ans(coins,amount,nextsum,total_coins+1,i);
        int considernext=ans(coins,amount,sum,total_coins,i+1);
        return Math.min(consider,considernext);
    }
    public int coinChange(int[] coins, int amount) {

        int n=coins.length;
        if(n==1 && amount==coins[0])
          return 1;
       
        int y= ans(coins,amount,0,0,0);
        if(y==Integer.MAX_VALUE)
           return -1;
        return y;   
    }
}
