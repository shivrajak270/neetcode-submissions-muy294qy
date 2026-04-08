class Solution {
    public boolean isPalindrome(String s) {

        int i=0;
        int n=s.length()-1;
        s = s.toLowerCase();

        while(i<n){
            while(!Character.isLetterOrDigit(s.charAt(i)) && i<n){
                     i++;
            }
            while(!Character.isLetterOrDigit(s.charAt(n)) && n>i){
                     n--;
            }
            if(s.charAt(i)==s.charAt(n)){
                i++;
                n--;
            }
            else{
                return false;
            }
            

        }
        return true;
        
    }
}
