class Solution {
    public int lengthOfLIS(int[] nums) {

        int n=nums.length;
        int []temp=new int[n];
        Arrays.fill(temp,1);
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    temp[i]=Math.max(temp[j]+1,temp[i]);
                }
            }
            max=Math.max(max,temp[i]);
        }
        return max;
        
    }
}
