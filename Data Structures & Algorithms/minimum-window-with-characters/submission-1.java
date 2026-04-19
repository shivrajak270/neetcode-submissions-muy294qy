class Solution {

    public boolean compare(int arr1[],int arr2[]){
       for(int i=0;i<arr2.length;i++){
        if(arr1[i]<arr2[i])
           return false;
       }
       return true;
    }
    public String minWindow(String s, String t) {
        int sar[]=new int[256];
        int tar[]=new int [256];

        for(int i=0;i<t.length();i++){
            tar[t.charAt(i)]++;
        }

        int left=0;int right=0;int min=Integer.MAX_VALUE;int n=s.length();
        int start=0;

        while(right<n){
            sar[s.charAt(right)]++;
            while(compare(sar,tar)){
                if (right - left + 1 < min) {
                     min = right - left + 1;
                    start = left;
                   }
                sar[s.charAt(left)]--;
                left++;
            }
            right++;
        }
        String ans="";
          if (min == Integer.MAX_VALUE) return ans;
        for(int i=start;i<min+start;i++){
            ans+=s.charAt(i);
        }
      
        return ans;







        
    }
}
