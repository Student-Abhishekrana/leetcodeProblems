class Solution {
    public int findJudge(int n, int[][] trust) {
       int indegree[] =new int[n+1];
       int outDegree[] =new int[n+1];

       for(int i=0; i<trust.length; i++){
        int a =trust[i][0];
        int b=trust[i][1];

        indegree[b]++;
        outDegree[a]++;
       } 

       int judge= -1;
       for(int i=1; i<=n; i++){
        if(indegree[i]==n-1 && outDegree[i]==0){
            judge =i;
        }
       }
       return judge;
    }
}