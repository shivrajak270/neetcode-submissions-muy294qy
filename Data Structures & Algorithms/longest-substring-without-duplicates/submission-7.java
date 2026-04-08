class Solution {
    public int lengthOfLongestSubstring(String s) {
      int max=0;
      int n=s.length();
      int j=0;
      Map<Character,Integer>gh=new HashMap<>();
      for(int i=0;i<n;i++){
        char sh=s.charAt(i);
        if(gh.containsKey(sh)){
             j = Math.max(j, gh.get(sh) + 1);
        }
        gh.put(sh,i);
           max=Math.max(i-j+1,max);
      }
      return max;
       
          
    }
}
