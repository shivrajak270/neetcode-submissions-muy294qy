class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character>gh=new HashSet<>();
        int n=s.length();
        int j=0;
        int max=0;

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
                while(gh.contains(ch)){
                    gh.remove(s.charAt(j));
                    j++;
                }
                 gh.add(ch);
                 max=Math.max(max,i-j+1);
            
        }
        return max;

       
          
    }
}
