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

List<Map.Entry<Integer,Integer>> list = new ArrayList<>(tmp.entrySet());

list.sort((a,b) -> b.getValue() - a.getValue());

int j = 0;

for(Map.Entry<Integer,Integer> e : list){
    if(j==k)
       break;
    arr[j] = e.getKey();   
    j++;
}

return arr;
}
}
