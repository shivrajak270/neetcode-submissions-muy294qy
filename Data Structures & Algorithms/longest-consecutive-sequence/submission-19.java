class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<1){
            return 0;
        }
        
        int n=nums.length;
        Arrays.sort(nums);
        int max=0;
        int count=0;
        for(int i=0;i<n-1;i++){
            if( nums[i+1]-nums[i]==1){
                count++;
                max=Math.max(max,count);
            }
            else if(nums[i+1]-nums[i]==0){
                continue;
            }
            else{
                count=0;
            }

        }
        return max+1;
    }
}
