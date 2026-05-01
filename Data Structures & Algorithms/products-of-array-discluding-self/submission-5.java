class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            int num=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    num*=nums[j];
                }
            }
            ans[i]=num;
        }
        
        return ans;
    }
}  
