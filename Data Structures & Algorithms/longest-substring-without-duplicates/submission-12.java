class Solution {
    public int lengthOfLongestSubstring(String s) {
      int[]ch=new int[256];
      Arrays.fill(ch,-1);
      int max=0;

      int i=0;
      int j;
      for(j=0;j<s.length();j++){
        char sh=s.charAt(j);
        if(ch[sh]==-1){
          ch[sh]=j;
        }
        else{
          i=Math.max(ch[sh]+1,i);
          ch[sh]=j;
        }
        max=Math.max(max,j-i+1);
      
      }
      return max;
        
    }
}
