class Solution {
    public boolean isAnagram(String s, String t) {

        char []sh=s.toCharArray();
        char []ls=t.toCharArray();
          
          Arrays.sort(sh);
          Arrays.sort(ls);

        if(sh.length!=ls.length){
            return false;
        }
        int h=sh.length;
        for(int i=0;i<h;i++){
            if(sh[i]!=ls[i]){
                return false;
            }
        }
        return true;

    }
}
