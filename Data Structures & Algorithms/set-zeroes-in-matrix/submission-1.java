class Solution {

    public void markZeros(int[][] ans, int row, int col) {
        int m = ans.length;
        int n = ans[0].length;

        // mark entire column
        for (int i = 0; i < m; i++) {
            ans[i][col] = 0;
        }

        // mark entire row
        for (int j = 0; j < n; j++) {
            ans[row][j] = 0;
        }
    }

    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[]row = new int[m];
        int []col=new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i]=-1;
                    col[j]=-1;
                }
            }
        }
        for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
            if(row[i]==-1 && col[j]==-1){
                markZeros(matrix,i,j);
            }
          }
        }


       
    }
}