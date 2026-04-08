class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer>temp= new HashMap<>();
      int []ans= new int [2];

      for(int i=0;i<nums.length;i++){
        int diff=target-nums[i];
        if(temp.containsKey(diff)){
            ans[0]=temp.get(diff);
            ans[1]=i;
            break;
        }
        temp.put(nums[i],i);
      }
      return ans;
    }
    
}
