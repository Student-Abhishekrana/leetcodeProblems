class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        paths(graph, 0, ans, path);
        return ans;

    }

    private static void paths(int[][] graph, int curr, List<List<Integer>> ans, List<Integer> path) {
        path.add(curr);
        if (curr == graph.length - 1) {
            ans.add(new ArrayList<>(path));
        } else {
            for (int next : graph[curr]) {
                paths(graph, next, ans, path);
                path.remove(path.size() - 1);
            }
                return;
        }
    }
}