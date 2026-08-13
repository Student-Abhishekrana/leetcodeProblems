class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj =new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }

        //take a array of integer size to calculate indegree 
        int []indegree =new int[numCourses];

        for(int i=0; i<prerequisites.length; i++){
            int src = prerequisites[i][0];
            int dest =prerequisites[i][1];

            adj.get(dest).add(src);
            indegree[src]++;
        }

        //take queue to perform bfs traversal

        Queue<Integer> q =new LinkedList<>();

        //run this for loop to check that which vertex will be added first

        for(int i=0; i<indegree.length; i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }

        int[] ans =new int[numCourses];
        int index=0;

int count=0;
        while(!q.isEmpty()){
            int curr =q.remove();
            count++;
            ans[index++] = curr;

            for(int conn : adj.get(curr)){
                indegree[conn]--;

                if(indegree[conn]==0){
                    q.add(conn);
                }
            }
        }

        if(count < numCourses){
            return new int[0];
        }

        return ans;
    }
}