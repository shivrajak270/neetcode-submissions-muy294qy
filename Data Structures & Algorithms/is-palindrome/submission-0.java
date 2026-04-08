class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char j=s.charAt(i);
            if(Character.isLetterOrDigit(j)){
                sb.append(Character.toLowerCase(j));
            }
        }
        String p=sb.toString();
        String q=sb.reverse().toString();
        if(p.equals(q))
            return true;

            return false;
    }
}
