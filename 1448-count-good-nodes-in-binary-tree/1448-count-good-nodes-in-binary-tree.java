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

    class NodeInfo
    {
        TreeNode node;
        int maxseen;

        NodeInfo(TreeNode node,int maxseen)
        {
            this.node = node;
            this.maxseen = maxseen;
        }
    }

    public int goodNodes(TreeNode root) {
        int count = 0;
        if(root == null) return count;
        Queue<NodeInfo> q = new LinkedList<>();
        q.offer(new NodeInfo(root, root.val));
        while(!q.isEmpty())
        {
            NodeInfo current = q.poll();
            TreeNode node = current.node;
            int maxseen = current.maxseen;
            if(node.val >= maxseen)
            {
                count++;

            }
            int newMax = Math.max(maxseen, node.val);
            if(node.left != null) 
            {
                q.offer(new NodeInfo(node.left,newMax));
            }
            if(node.right != null)
            {
                q.offer(new NodeInfo(node.right,newMax));
            }
        }
        return count;
    }
}