class Solution {
    int empty = 1;
    int result = 0;

    public int uniquePathsIII(int[][] grid) {
        int startX = 0, startY = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    startX = i;
                    startY = j;
                } else if (grid[i][j] == 0) {
                    empty++;
                }
            }
        }

        dfs(grid, startX, startY, 0);
        return result;
    }

    private void dfs(int[][] grid, int startX, int startY, int count) {

        if (startX < 0 || startX >= grid.length || startY < 0 || startY >= grid[0].length || grid[startX][startY] == -1) {
            return;
        }

        if (grid[startX][startY] == 2) {
            if (count == empty) {
                result++;
            }
            return;
        }

        grid[startX][startY] = -1;

        dfs(grid, startX + 1, startY, count + 1);
        dfs(grid, startX, startY + 1, count + 1);
        dfs(grid, startX - 1, startY, count + 1);
        dfs(grid, startX, startY - 1, count + 1);
        grid[startX][startY] = 0;
    }

}