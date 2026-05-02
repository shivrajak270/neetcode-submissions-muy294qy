class Solution {

    public boolean isPalindrome(String s) {

        StringBuffer sb= new StringBuffer();

        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        String h=sb.toString();
        String j=sb.reverse().toString();
        if(h.equals(j))
          return true;
        return false;
    }
}
