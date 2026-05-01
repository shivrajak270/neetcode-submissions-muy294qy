class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Integer>tmp=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            tmp.put(nums[i],i);
        }
        int maxi=0;

        for(int i:nums){
            if(tmp.containsKey(i)){
                int max=0;
                while(tmp.containsKey(i)){
                    max++;
                    i--;
                }
                maxi=Math.max(maxi,max);
            }
        }
        return maxi;
        
    }
}
