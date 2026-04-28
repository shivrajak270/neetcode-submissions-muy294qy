class Solution {
    public boolean isAnagram(String s, String t){

        if(s.length()!=t.length())
             return false;



        int[]sg=new int[26];

        for(int i=0;i<s.length();i++){
            sg[s.charAt(i)-'a']++;
            sg[t.charAt(i)-'a']--;
        }
        for(int j:sg){
            if(j!=0){
                return false;
            }
        }
        return true;
       
    }
}