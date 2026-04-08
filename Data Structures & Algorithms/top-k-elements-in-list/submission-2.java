class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[]=new int[k];

        Map<Integer,Integer>h=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
       PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
       for(Map.Entry<Integer,Integer>s:h.entrySet()){
        pq.add(s);
         if(pq.size()>k)
           pq.poll();
       }
          int j=0;

while(!pq.isEmpty()){
    ans[j] = pq.poll().getKey();
    j++;
}
       return ans;
       


        
    }
}
