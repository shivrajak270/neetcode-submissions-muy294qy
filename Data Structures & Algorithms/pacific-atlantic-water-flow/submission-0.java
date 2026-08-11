class Solution {

    int rows;
    int cols;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        rows = heights.length;
        cols = heights[0].length;

        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];

        // Pacific: top row
        for (int c = 0; c < cols; c++) {
            dfs(heights, 0, c, pacific);
        }

        // Pacific: left column
        for (int r = 0; r < rows; r++) {
            dfs(heights, r, 0, pacific);
        }

        // Atlantic: bottom row
        for (int c = 0; c < cols; c++) {
            dfs(heights, rows - 1, c, atlantic);
        }

        // Atlantic: right column
        for (int r = 0; r < rows; r++) {
            dfs(heights, r, cols - 1, atlantic);
        }

        List<List<Integer>> answer = new ArrayList<>();

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                if (pacific[r][c] && atlantic[r][c]) {
                    answer.add(Arrays.asList(r, c));
                }
            }
        }

        return answer;
    }

    public void dfs(int[][] heights, int r, int c, boolean[][] visited) {

        // Out of bounds
        if (r < 0 || r >= rows || c < 0 || c >= cols) {
            return;
        }

        // Already visited
        if (visited[r][c]) {
            return;
        }

        visited[r][c] = true;

        // Down
        if (r + 1 < rows &&
                heights[r + 1][c] >= heights[r][c]) {

            dfs(heights, r + 1, c, visited);
        }

        // Up
        if (r - 1 >= 0 &&
                heights[r - 1][c] >= heights[r][c]) {

            dfs(heights, r - 1, c, visited);
        }

        // Right
        if (c + 1 < cols &&
                heights[r][c + 1] >= heights[r][c]) {

            dfs(heights, r, c + 1, visited);
        }

        // Left
        if (c - 1 >= 0 &&
                heights[r][c - 1] >= heights[r][c]) {

            dfs(heights, r, c - 1, visited);
        }
    }
}