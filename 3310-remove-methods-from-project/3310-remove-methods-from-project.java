class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        boolean vis[] = new boolean[n];

        List<List<Integer>> forward = new ArrayList<>();
        List<List<Integer>> reverse = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            forward.add(new ArrayList<>());
            reverse.add(new ArrayList<>());
        }

        for (int edge[] : invocations) {

            forward.get(edge[0]).add(edge[1]);
            reverse.get(edge[1]).add(edge[0]);

        }
        dfsCheck(forward, k, vis);

        HashSet<Integer> suspicious = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (vis[i]) {
                suspicious.add(i);
            }
        }

        //to check from outsider

        for (int node : suspicious) {
            for (int invoker : reverse.get(node)) {
                if (!suspicious.contains(invoker)) {
                    return allMethod(n);
                }
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!suspicious.contains(i)) {
                ans.add(i);
            }
        }
        return ans;

    }

    private static void dfsCheck(List<List<Integer>> forward, int start, boolean[] vis) {
        if (vis[start]) {
            return;
        }
        vis[start] = true;

        for (int neighbour : forward.get(start)) {

            dfsCheck(forward, neighbour, vis);

        }
    }

    private static List<Integer> allMethod(int n){
       List<Integer> ans =new ArrayList<>();
        for(int i=0; i<n; i++){
            ans.add(i);
        }
        return ans;
    }

}