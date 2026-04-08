class Solution {
    public int lengthOfLongestSubstring(String s) {
      int max=0;
      int n=s.length();
      int j=0;
      int i=0;
      Set<Character>hj=new HashSet<>();
      while(i<n){
        char sh=s.charAt(i);
        while(hj.contains(sh) && j<i){
              hj.remove(s.charAt(j));
              j++;
        }
        hj.add(sh);
        max=Math.max(max,i-j+1);
        i++;
      }
      return max;
       
          
    }
}
