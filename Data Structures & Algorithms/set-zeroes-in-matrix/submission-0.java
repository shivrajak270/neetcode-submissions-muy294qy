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

        int[][] ans = new int[m][n];

        // Step 1: copy original matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = matrix[i][j];
            }
        }

        // Step 2: whenever original has 0 → mark in ans
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    markZeros(ans, i, j);
                }
            }
        }

        // Step 3: copy back to original matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = ans[i][j];
            }
        }
    }
}