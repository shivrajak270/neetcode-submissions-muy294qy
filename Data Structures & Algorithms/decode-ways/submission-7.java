class Solution {


    public int countDigits(int i,int n,String s,int dp[]){
        if (s == null || s.isEmpty()) {
            return 0;
        }

        n = s.length();

        if (s.charAt(0) == '0') {
            return 0;
        }

        dp[0]=1;
        dp[1]=1;
        for(i=2;i<=n;i++){
             int oneDigit = s.charAt(i - 1) - '0';

            if (oneDigit >= 1 && oneDigit <= 9) {
                dp[i] += dp[i - 1];
            }

            // Two digits
            int twoDigit = (s.charAt(i - 2) - '0') * 10
                         + (s.charAt(i - 1) - '0');

            if (twoDigit >= 10 && twoDigit <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[n];
         
    }
    public int numDecodings(String s) {

        int dp[]=new int[s.length()+1];


        int n=s.length();
        int i=0;

        int u=countDigits(0,n,s,dp);
        return u;
        
    }
}
