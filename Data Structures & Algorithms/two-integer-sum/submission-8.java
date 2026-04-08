class Solution {

    class Pair{
        int value;
        int index;
        Pair(int value,int index){
            this.value=value;
            this.index=index;
        }
    }
    public int[] twoSum(int[] nums, int target) {
       int n= nums.length;
        Pair[]arr=new Pair[n];
        int ans[]=new int[2];

        for(int i=0;i<n;i++){
            arr[i]=new Pair(nums[i],i);

        }
        Arrays.sort(arr,(a,b)->Integer.compare(a.value,b.value));


        int i=0;
        int j=arr.length-1;

        while(i<j){
            int sum =arr[i].value+arr[j].value;
            if(sum==target){
                ans[0]=Integer.min(arr[i].index,arr[j].index);
                ans[1]=Integer.max(arr[i].index,arr[j].index);
                break;
                
            }
            else if(sum<target){
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
        
    }
}
