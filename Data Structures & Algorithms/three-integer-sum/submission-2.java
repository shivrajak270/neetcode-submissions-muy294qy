class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

       
        Set<List<Integer>>ans=new HashSet<>();
        int n=nums.length;

        for(int i=0;i<n-1;i++){
             Set<Integer>gh=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int diff=-(nums[i]+nums[j]);
                if(gh.contains(diff)){
                    List<Integer>small=new ArrayList<>();
                    small.add(nums[i]);
                    small.add(nums[j]);
                    small.add(diff);
                    Collections.sort(small);
                    ans.add(small);
                }
                else{
                    gh.add(nums[j]);
                }

            }
        }
         return new ArrayList<>(ans);
        
    }
}
