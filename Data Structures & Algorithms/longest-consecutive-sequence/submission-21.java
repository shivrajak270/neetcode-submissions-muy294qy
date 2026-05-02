class Solution {
    public int longestConsecutive(int[] nums) {
        
        int n=nums.length;
        int max=0;
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       if(n<1)
         return 0;

       for(int i=0;i<nums.length;i++){
        pq.add(nums[i]);
       }
       int count=0;
       while(!pq.isEmpty() ){
          int top=pq.poll();
          if(pq.isEmpty())
             break;
        int secondtop=pq.peek();
        if(secondtop-top==1){
            count++;
            max=Math.max(count,max);
        }
        else if(secondtop-top==0)
              continue;
        else{
            count=0;
        }
       }
       return max+1;
    }
}
