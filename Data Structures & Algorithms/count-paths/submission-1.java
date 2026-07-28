class Solution {

    int something(int i,int j,int m,int n,int [][]dp){

      
        if(i>=m || j>=n)
          return 0;
        if(i==m-1 && j==n-1){
            return 1;
        }
          if(dp[i][j]!=-1)
          return dp[i][j];

       dp[i][j]=something(i+1,j,m,n,dp)+something(i,j+1,m,n,dp); 
       return dp[i][j];
    }
    public int uniquePaths(int m, int n) {

         int[][] dp = new int[m][n];

    for (int[] row : dp) {
        Arrays.fill(row, -1);
    }


        int count=0;
       count=something(0,0,m,n,dp);
       return count;
        
    }
}
