class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        int [] indegree= new int[numCourses];
        boolean[][] prereq =new boolean[numCourses][numCourses];

        //we have create array for indegree 
        for (int i = 0; i < prerequisites.length; i++) {
            int src = prerequisites[i][0];
            int dest = prerequisites[i][1];

            adj.get(src).add(dest);
            prereq[dest][src] =true;
            indegree[dest]++;

        }

        //take a Queue to store curr Vertex

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        ArrayList<Integer> temp = new ArrayList<>();

        while (!q.isEmpty()) {
            int curr = q.remove();
            temp.add(curr);

            for (int conn : adj.get(curr)) {
                for(int i=0; i<numCourses; i++){
                    if(prereq[curr][i]){
                        prereq[conn][i] =true;
                    }
                }
                indegree[conn]--;
                if (indegree[conn] == 0) {
                    q.add(conn);
                }
            }
        }

        List<Boolean> ans =new ArrayList<>();
        //this is for queries

        for(int [] query :queries ){
            int src=query[0];
            int dest = query[1];
            ans.add(prereq[dest][src]);
        }
        return ans;

    }
}