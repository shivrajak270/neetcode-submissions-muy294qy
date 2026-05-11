class Solution {


    public int countDigits(int i,int n,String s,int dp[]){
         if(i==n)
           return 1;

        if(s.charAt(i)=='0')
            return 0;


             if(dp[i]!=-1)
              return dp[i];
          int onedigit=0;
           onedigit= countDigits(i+1,n,s,dp);
           
           int twodigit=0;
          if(i+1<n){
            int num=(s.charAt(i)-'0')*10 + s.charAt(i+1)-'0';

            if (num >= 10 && num <= 26) {
                twodigit = countDigits(i + 2,n,s,dp);  
          } 
        }
              dp[i]=onedigit+twodigit;
              return dp[i];
            


    }
    public int numDecodings(String s) {

        int dp[]=new int[s.length()];
        Arrays.fill(dp,-1);

        int n=s.length();
        int i=0;

        int u=countDigits(0,n,s,dp);
        return u;
        
    }
}
