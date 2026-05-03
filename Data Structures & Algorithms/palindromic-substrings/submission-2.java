class Solution {



    int ispalin(String s,int left,int right){
        int count=0;
        int n=s.length();
        while(left<=right && right<n && left>=0){
            if(s.charAt(left)==s.charAt(right)){
                count++;
                 left--;
             right++;
            }
            else
               break;
            
      
        }
        return count;
    }

    public int countSubstrings(String s) {
        int n=s.length();
        int count=0;

        for(int i=0;i<n;i++){
            int odd=ispalin(s,i,i);
            int even=ispalin(s,i,i+1);
            count+=odd;
            count+=even;
            }
        
        return count;
        
    }
}
