class Solution {
    public boolean isAnagram(String s, String t){
          if(s.length()!=t.length())
             return false;
       int[]ch=new int[256];


      for(int i=0;i<s.length();i++){
          ch[s.charAt(i)-'a']++;
          ch[t.charAt(i)-'a']--;
      }
      for(int y:ch){
        if(y!=0)
           return false; 
      }
       return true;
    }
}