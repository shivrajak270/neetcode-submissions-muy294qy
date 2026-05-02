class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        Map<Integer,Integer>tmp=new HashMap<>();
        int n=nums.length;

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            tmp.put(nums[i],i);
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int sum=nums[i]+nums[j];
                if(tmp.containsKey(-sum) && tmp.get(-sum)!=i && tmp.get(-sum)!=j){
                    ArrayList<Integer>hhj=new ArrayList<>();
                    hhj.add(nums[i]);
                    hhj.add(nums[j]);
                    hhj.add(-sum);
                    Collections.sort(hhj);
                    if(!ans.contains(hhj)){
                        ans.add(hhj);
                    }
                }
                  
            }
        }
        return ans;
    }
}
