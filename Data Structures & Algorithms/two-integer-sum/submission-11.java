class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        int i=0;
        Map<Integer,Integer>ans=new HashMap<>();
        int gh=0;
        while(i<nums.length){
            if(!ans.isEmpty() && ans.containsKey(target-nums[i])){
                arr[1]=i;
                arr[0]=ans.get(target-nums[i]);
                break;
            }
            ans.put(nums[i],i);
            i++;
        }
        return arr;


    }
        
    }

