class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int left=0;
        

        Arrays.sort(nums);

        List<List<Integer>>ans=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int right=nums.length-1;

            if(i!=0 && nums[i-1]==nums[i]){
                continue;
            }


            left=i+1;
            while(left<right){
                int sum=nums[left]+nums[right]+nums[i];
            
                if(sum==0){
                    List<Integer>temp=new ArrayList<>();
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    temp.add(nums[i]);
                    ans.add(temp);
                    left++;
                    right--;
                    while(nums[left-1]==nums[left] && left<right){
                        left++;
                    }
                    while(nums[right+1]==nums[right] && left<right){
                        right--;
                    }
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return ans;

        
    }
}
