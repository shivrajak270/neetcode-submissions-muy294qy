class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
       Set<Integer> gh = new HashSet<>();
       for(int n : nums){
          gh.add(n);
           }
       int max=1;
       int k=1;
       for(int i=0;i<nums.length;i++){
        int num=nums[i]+1;
        while(gh.contains(num)){
            k++;
            num++;
        }
        max=Math.max(max,k);
        k=1;
       }

       return max;

    }
}
