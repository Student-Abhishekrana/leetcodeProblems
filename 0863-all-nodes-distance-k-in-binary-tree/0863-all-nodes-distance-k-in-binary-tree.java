/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> result =new ArrayList<>();
        if(root==null || target==null){
            return result;
        }
        if(k==0){
        result.add(target.val);
        return result;
        }

        HashMap<Integer,List<Integer>> graph =new HashMap<>();
        buildGraph(root,null,graph); // curr, parent , graph

        int currDist =0;

        Queue<Integer> q =new LinkedList<>();
        HashSet<Integer> visited =new HashSet<>();

        q.offer(target.val);
        visited.add(target.val);

        while(!q.isEmpty()){
            if(currDist==k){
                while(!q.isEmpty()){
                    result.add(q.poll());
                }
                return result;
            }

            int levelSize =q.size();

            for(int i=0; i<levelSize; i++){
                int curr =q.poll();
                for(int neigh :graph.getOrDefault(curr,Collections.emptyList())){
                    if(!visited.contains(neigh)){
                        visited.add(neigh);
                        q.offer(neigh);
                    }
                }
            }
            currDist++;

        }
        return result;

    }
    private void buildGraph(TreeNode curr, TreeNode parent, HashMap<Integer,List<Integer>> graph){
        if(curr==null){
            return;
        }
        graph.putIfAbsent(curr.val,new ArrayList<>());

        if(parent != null){
            graph.get(curr.val).add(parent.val);
            graph.get(parent.val).add(curr.val);
        }
        buildGraph(curr.left,curr,graph);
        buildGraph(curr.right,curr,graph);
    }
}