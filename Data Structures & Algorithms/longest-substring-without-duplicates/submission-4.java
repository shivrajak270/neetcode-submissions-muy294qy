class Solution {
    public int lengthOfLongestSubstring(String s) {
       int max=0;
        int n=s.length();
        for(int i=0;i<n;i++){
         HashSet<Character>gh=new HashSet<>();
         for(int j=i;j<n;j++){
            char g=s.charAt(j);
            if(gh.contains(g)){
                break;
            }
            else{
                gh.add(g);
                max=Math.max(max,gh.size());
            }
         }
        }
        return max;
       
          
    }
}
