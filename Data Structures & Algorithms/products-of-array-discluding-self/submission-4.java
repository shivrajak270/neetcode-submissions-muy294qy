class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int prefix=1;
        int suffix=1;
        int ans[]=new int[n];

        for(int i=0;i<n;i++){
            if(i==0)
              ans[i]=1;
            else{
                prefix=prefix*nums[i-1];
                ans[i]=prefix;
            }  
        }
        for(int i=n-1;i>=0;i--){
            if(i==n-1)
              ans[i]*=1;
            else{
                suffix=suffix*nums[i+1];
                ans[i]=ans[i]*suffix;
            }  
        }
        return ans;
        
    }
}  
