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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int height = balanced(root);
        if(height != -1) return true;
        return false;
    }
    private int balanced(TreeNode root)
    {
        if(root == null) return 0;
        int leftheight = balanced(root.left);
        if(leftheight == -1) return -1;
        int rightheight = balanced(root.right);
        if(rightheight == -1) return -1;
        
        if(Math.abs(leftheight - rightheight) > 1) return -1;
        return 1 + Math.max(leftheight,rightheight);
    }
}