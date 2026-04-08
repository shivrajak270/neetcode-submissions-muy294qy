class Solution {
    public int characterReplacement(String s, int k) {

        int max=0;
        for(int i=0;i<s.length();i++){
            char[]hj=new char[26];
            int maxfreq=0;
            int len=0;
            for(int j=i;j<s.length();j++){
                hj[s.charAt(j)-'A']++;
                maxfreq=Math.max(hj[s.charAt(j)-'A'],maxfreq);
                len=j-i+1;
                int number_of_changes=len-maxfreq;
                if(number_of_changes<=k){
                    max=Math.max(max,len);
                }
                else
                   break;

            }
        }
       return max;
    }
}

