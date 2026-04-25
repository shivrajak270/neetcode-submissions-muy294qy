class Solution {

   
    public int rob(int[] nums) {

              if (nums.length == 1) return nums[0];




      int prev1=0;
      int prev2=0;
      int curr=0;
      for(int i=0;i<=nums.length-2;i++){
        curr=Math.max(prev2+nums[i],prev1);
        prev2=prev1;
        prev1=curr;
      }
      int onelopp=prev1;

           prev1=0;
      prev2=0;
      curr=0;
       for(int i=1;i<=nums.length-1;i++){
        curr=Math.max(prev2+nums[i],prev1);
        prev2=prev1;
        prev1=curr;
      }
      int loopp2=prev1;

      return Math.max(loopp2,onelopp);
    }
}
