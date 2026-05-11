class Solution {

    public int countWays(String s, int index, int dp[]) {

        // Successfully decoded whole string
        if (index == s.length()) {
            return 1;
        }

        // Invalid if starts with 0
        if (s.charAt(index) == '0') {
            return 0;
        }


        if (dp[index] != -1) {
            return dp[index];
        }
        int oneDigit = countWays(s, index + 1, dp);


        int twoDigit = 0;

        if (index + 1 < s.length()) {

            int num = (s.charAt(index) - '0') * 10
                    + (s.charAt(index + 1) - '0');

            if (num >= 10 && num <= 26) {
                twoDigit = countWays(s, index + 2, dp);
            }
        }

        return dp[index] = oneDigit + twoDigit;
    }

    public int numDecodings(String s) {

        if (s == null || s.isEmpty()) {
            return 0;
        }

        int dp[] = new int[s.length()];
        Arrays.fill(dp, -1);

        return countWays(s, 0, dp);
    }
}