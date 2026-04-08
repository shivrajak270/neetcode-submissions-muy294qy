class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;

        int j=0;
        for(int i=0;i<n;i++){
            j=j^i+1;
            j=j^nums[i];
        }
        return j;
    }
}
