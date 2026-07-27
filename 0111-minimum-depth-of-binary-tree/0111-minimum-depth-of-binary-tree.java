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
    static int minDepth = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {
        minDepth = Integer.MAX_VALUE;
        if (root == null) {
            return 0;
        }
        dfs(root, 1);
        return minDepth;
    }

    private static void dfs(TreeNode curr, int level) {
        if (curr == null) {
            return;
        }

        if (curr.left == null && curr.right == null) {
            minDepth = Math.min(minDepth, level);
            return;
        }
        dfs(curr.left, level + 1);
        dfs(curr.right, level + 1);
    }
}