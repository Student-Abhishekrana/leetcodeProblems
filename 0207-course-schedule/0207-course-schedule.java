class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites.length==0){
            return true;
        }
        ArrayList<ArrayList<Integer>> adj =new ArrayList<>();

        for(int i=0;i<numCourses; i++){
            adj.add(new ArrayList<>()); 
        }

        // we ha ve to calculae the indegree to solve this problems
        int [] indegree =new int[numCourses];

        for(int i =0; i<prerequisites.length; i++){
            int src =prerequisites[i][0];
            int dest =prerequisites[i][1];

            adj.get(dest).add(src);

            indegree[src]++;
        }

        // we have use here queue for bfs traversal

        Queue<Integer> q= new LinkedList<>();

        //iterate through adj array if(indegree[i]==0){q.add(i)}


        for(int i=0; i<indegree.length; i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }

        int count=0;

        while(!q.isEmpty()){
            int curr = q.remove();
            count++;

            for(int conn : adj.get(curr)){
                indegree[conn]--;
                if(indegree[conn]==0){
                    q.add(conn);
                }
            }
        }

       
        return count==numCourses;
    }
}