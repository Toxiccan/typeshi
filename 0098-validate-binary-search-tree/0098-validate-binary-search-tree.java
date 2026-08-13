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
    public boolean isValidBST(TreeNode root) {
        long lowerbound = Long.MIN_VALUE;
        long upperbound = Long.MAX_VALUE;

        return dfs(root, lowerbound, upperbound);
    }

    private boolean dfs(TreeNode root, long lowerbound, long upperbound) {
        if (root == null) return true;

        if (root.val <= lowerbound || root.val >= upperbound) {
            return false;
        }

        return dfs(root.left, lowerbound, root.val) &&
               dfs(root.right, root.val, upperbound);
    }
}