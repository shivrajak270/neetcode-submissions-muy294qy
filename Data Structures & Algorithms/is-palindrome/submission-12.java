class Solution {
    public boolean isPalindrome(String s) {

        int i=0;
        int n=s.length()-1;
        s = s.toLowerCase();
        int left=0;
        int right=n;
        while(left<=n/2){
             while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
             }
             while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
             }
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;

        }
        return true;


        
    }
}
