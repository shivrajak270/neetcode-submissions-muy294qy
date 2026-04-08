class Solution {
    public boolean isAnagram(String s, String t){

        if(s.length()!=t.length()){
            return false;
        }
        int jk[]=new int[256];

        for(int i=0;i<s.length();i++){
            jk[s.charAt(i)-'0']++;
            jk[t.charAt(i)-'0']--;
        }
        for(int j:jk){
            if(j!=0)
              return false;
        }
        return true;

        
    }
}