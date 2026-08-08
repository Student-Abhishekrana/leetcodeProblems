class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
       

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    perimeter += helper(grid, r, c);
                }
            }
        }
        return perimeter;
    }

    private int helper(int[][] grid, int r, int c) {
        if (r < 0  || r >= grid.length || c < 0|| c >= grid[0].length || grid[r][c] == 0) {
            return 1;
        }
        if (grid[r][c] == -1) {
            return 0;
        }

        grid[r][c] =-1;

        return helper(grid, r + 1, c) +
                helper(grid, r - 1, c) +
                helper(grid, r, c + 1) +
                helper(grid, r, c - 1);

    }
}