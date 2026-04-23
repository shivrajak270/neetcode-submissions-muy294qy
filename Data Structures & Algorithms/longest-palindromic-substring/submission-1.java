class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String ans = "";

        int i=0;
        int max=1;
        while(i<s.length()){
            int left=i;
            int right=i;
            while(right<s.length() && left>=0 && s.charAt(left)==s.charAt(right) ){
                if(ans.length()<right-left+1){
                    ans=s.substring(left,right+1);
                }
                    left--;
                    right++;

                }

             left=i;
             right=i+1;
            while(right<s.length() && left>=0 && s.charAt(left)==s.charAt(right) ){
                if(ans.length()<right-left+1){
                    ans=s.substring(left,right+1);
                }
                    left--;
                    right++;

                }    
               
                
            
            i++;
        }
        return ans;

    

    }
}