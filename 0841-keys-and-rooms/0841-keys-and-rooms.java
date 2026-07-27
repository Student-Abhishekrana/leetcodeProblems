class Solution {
    static int count =0;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n =rooms.size();
        boolean vis[] =new boolean[n];
        count =0;
        dfs(0,vis,rooms);
        if(count==n){
            return true;
        }else{
            return false;
        }
    }

    public void dfs(int curr,boolean[] vis, List<List<Integer>> rooms) {
        vis[curr] = true;

        count++;

        for (int conn : rooms.get(curr)) {
            if (!vis[conn]) {
                vis[conn] = true;
                dfs(conn, vis, rooms);
            }
        }
    }
}