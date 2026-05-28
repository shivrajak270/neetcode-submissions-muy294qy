class Solution {
    public int characterReplacement(String s, int k) {

        int mark[]=new int[26];

        int left=0;
        int right=0;
        int maxlength=0;
        int maxfrequency=0;
        while(right<s.length()){
            mark[s.charAt(right)-'A']++;
            int freq=mark[s.charAt(right)-'A'];
            maxfrequency=Math.max(freq,maxfrequency);
           
            int length=right-left+1;

            while((right-left+1)-maxfrequency>k){
                mark[s.charAt(left)-'A']--;
                left++;
            }
             maxlength = Math.max(maxlength, right - left + 1);
              right++;
        }

        return maxlength;
        
    }
}
