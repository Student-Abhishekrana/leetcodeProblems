class Solution {
    public int numIslands(char[][] grid) {
        int counter = 0;
        int n = grid.length;
        int m = grid[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    counter++;
                    dfs(grid, n, m, i, j);
                }
            }
        }
        return counter;
    }

    public static void dfs(char[][] grid, int n, int m, int i, int j) {

        if (i < 0 || j < 0 || i == n || j == m || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';

        dfs(grid, n, m, i - 1, j);
        dfs(grid, n, m, i + 1, j);
        dfs(grid, n, m, i, j - 1);
        dfs(grid, n, m, i, j + 1);

    }
}