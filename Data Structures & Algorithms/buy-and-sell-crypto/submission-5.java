class Solution {
    public int maxProfit(int[] prices) {

        int max=0;
        int n=prices.length;
        int min=prices[0];

        for(int i=1;i<n;i++){
            max=Math.max(prices[i]-min,max);   
            if(min>prices[i]){
                min=prices[i];
            }
            
        }
        return max;
        
        
    }
}
