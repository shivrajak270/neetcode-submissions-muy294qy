class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      Map<Integer,Integer>tmp=new HashMap<>();
      int arr[]=new int[k];

      int n=nums.length;
      for(int i=0;i<n;i++){
        if(tmp.containsKey(nums[i]))
           tmp.put(nums[i],tmp.get(nums[i])+1);
        else
           tmp.put(nums[i],1);
               
      }
      List<Map.Entry<Integer,Integer>>hj=new ArrayList<>(tmp.entrySet());

      hj.sort((a,b)->b.getValue()-a.getValue());

      int j=0;
      for(Map.Entry<Integer,Integer>hjs:hj){
        if(j==k)
           break;
        arr[j]=hjs.getKey();  
        j++; 
      }


return arr;
}
}
