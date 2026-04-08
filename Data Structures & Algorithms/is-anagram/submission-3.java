class Solution {
    public boolean isAnagram(String s, String t) {

        char []sh=s.toCharArray();
        char []ls=t.toCharArray();
          
          Arrays.sort(sh);
          Arrays.sort(ls);

        if(sh.length!=ls.length){
            return false;
        }
        if(!Arrays.equals(sh,ls)){
            return false;
        }
        return true;

    }
}