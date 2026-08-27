/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<TreeNode> generateTrees(int n) {
        return generate(1,n);
    }
    private List<TreeNode> generate(int start, int end){

        List<TreeNode> result =new ArrayList<>();
        if(start>end){
            result.add(null);
            return result;
        
        }

        for(int i=start;i<end+1;i++){
            List<TreeNode> left =generate(start,i-1);
            List<TreeNode> right =generate(i+1,end);

            for(TreeNode l:left){
                for(TreeNode r:right){
                    TreeNode currRoot =new TreeNode(i);
                    currRoot.left =l;
                    currRoot.right=r;
                    result.add(currRoot);

                }
            }
        }
        return result;
    }
}