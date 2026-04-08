class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[]=new int[k];

        Map<Integer,Integer>h=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        List<List<Integer>>gj=new ArrayList<>();

        for(int i = 0; i <= n; i++){
    gj.add(new ArrayList<>());
}

        
        for(Map.Entry<Integer,Integer>gh:h.entrySet()){
            int key=gh.getKey();
            int value=gh.getValue();
            gj.get(value).add(key);
        }
        int j=0;
        for(int i = n; i >= 0; i--){
          for(int num : gj.get(i)){
              if(j == k)
                  break;
                ans[j] = num;
                j++;

      
    }
}
      
       return ans;
       


        
    }
}
