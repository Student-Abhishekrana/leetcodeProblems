class Solution {
   public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int r = grid.length;
        int c = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int freshCount = 0;

        // Step 1: Insert all initially rotten oranges into the queue and count fresh ones
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[] { i, j });
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }

        // If there are no fresh oranges from the start, 0 minutes are needed
        if (freshCount == 0) {
            return 0;
        }

        int minutes = 0;
        int turnedRottenCount = 0;
        
        // Directions for moving Up, Down, Right, and Left
        int[] dx = { 0, 0, 1, -1 };
        int[] dy = { 1, -1, 0, 0 };

        // Step 2: Perform BFS layer by layer (minute by minute)
        while (!q.isEmpty()) {
            int size = q.size();
            boolean rottedThisRound = false;

            for (int i = 0; i < size; i++) {
                int[] point = q.poll();

                for (int j = 0; j < 4; j++) {
                    int x = point[0] + dx[j];
                    int y = point[1] + dy[j];

                    // Check boundaries and check if the adjacent orange is fresh
                    if (x >= 0 && x < r && y >= 0 && y < c && grid[x][y] == 1) {
                        grid[x][y] = 2; // Turn it rotten
                        q.offer(new int[] { x, y });
                        turnedRottenCount++;
                        rottedThisRound = true;
                    }
                }
            }

            // Time only advances if at least one fresh orange was infected in this layer
            if (rottedThisRound) {
                minutes++;
            }
        }

        // Step 3: If we rotted all fresh oranges, return time; otherwise, return -1
        return turnedRottenCount == freshCount ? minutes : -1;
}

}