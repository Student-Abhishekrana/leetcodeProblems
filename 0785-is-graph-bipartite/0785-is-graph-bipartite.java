class Solution {
    public static class Edge {
        int src, dest, weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public boolean isBipartite(int[][] graph) {
        int color[] = new int[graph.length];
        Arrays.fill(color, -1);
        for (int i = 0; i < color.length; i++) {
            if (color[i] == -1) {
                if (!bfsCheck(graph, i, color)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean bfsCheck(int[][] graph, int start, int[] color) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        color[start] = 0;

        while (!q.isEmpty()) {
            int curr = q.poll();
            for (int neighbour : graph[curr]) {

                

                    if (color[neighbour] == -1) {
                        color[neighbour] = 1 - color[curr];
                        q.add(neighbour);
                    } else if (color[neighbour] == color[curr]) {
                        return false;
                    }
                
            }
        }
        return true;
    }

}