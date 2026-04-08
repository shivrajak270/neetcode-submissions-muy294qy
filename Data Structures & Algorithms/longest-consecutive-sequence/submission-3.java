class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int max=1;
        int sum=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]==1){
                sum++;
                max=Integer.max(max,sum);
            }
            else if(nums[i+1]-nums[i]==0){
                continue;
            }
            else{
                sum=1;
            }
        }
        return max;
        
    }
}
