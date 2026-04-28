class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;

        Set<Integer>sh=new HashSet<>();

        for(int i=0;i<n;i++){
            if(sh.contains(nums[i])){
                return true;
            }
            sh.add(nums[i]);
        }
       return false;
        
    }
}