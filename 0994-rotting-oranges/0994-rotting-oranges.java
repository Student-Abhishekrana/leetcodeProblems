class Solution {
    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int r = grid.length;
        int c = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh_orange = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[] { i, j });
                }
                if (grid[i][j] == 1) {
                    fresh_orange++;
                }
            }
        }
        if (fresh_orange == 0) {
            return 0;
        }
        int minutes = 0;
        int rotted_count = 0;
        int[] dx = { 0, 0, 1, -1 };
        int[] dy = { 1, -1, 0, 0 };

        while (!q.isEmpty()) {
            int size = q.size();
            
            for (int i = 0; i < size; i++) {
                int[] point = q.poll();
                for (int j = 0; j < 4; j++) {

                    int x = point[0] + dx[j];
                    int y = point[1] + dy[j];

                    if (x < 0 || y < 0 || x >= r || y >= c || grid[x][y] != 1) {
                        continue;
                    }
                    grid[x][y] = 2;
                    q.offer(new int[] { x, y });
                    rotted_count++;
                }
            }
        if (q.size() != 0) {
            minutes++;
        }
        }
        return fresh_orange == rotted_count ? minutes : -1;
    }
}