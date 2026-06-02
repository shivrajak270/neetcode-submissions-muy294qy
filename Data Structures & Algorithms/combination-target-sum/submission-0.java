class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public void recur(int nums[],int i,int target,List<Integer>temp){

        if(target==0){
          ans.add(new ArrayList<>(temp));
          return;
        }
        if(i>nums.length-1 || target<0){
            return;
        }
        temp.add(nums[i]);
        recur(nums,i,target-nums[i],temp);
        temp.remove(temp.size()-1);
        recur(nums,i+1,target,temp);
    }


    public List<List<Integer>> combinationSum(int[] nums, int target) {

      recur(nums,0,target,new ArrayList<>());
      return ans;
    }
}
