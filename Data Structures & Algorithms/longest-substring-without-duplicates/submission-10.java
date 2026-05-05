class Solution {
    public int lengthOfLongestSubstring(String s) {
      int max=0;
      int n=s.length();
      int j=0;
      int i=0;
      Set<Character>hj=new HashSet<>();
      while(i<=j && j<n){
        char maybe=s.charAt(j);
        while(hj.contains(maybe)){
          hj.remove(s.charAt(i));
          i++;
        }
     
        hj.add(maybe);
        max=Math.max(max,j-i+1);
        j++;
        
    }
    return max;
    }
}
