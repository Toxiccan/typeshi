/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    private void dfs(TreeNode root,StringBuilder sb)
    {
        if(root == null)
        {
            sb.append("N,");
            return;
        }
        sb.append(root.val + ",");
        dfs(root.left,sb);
        dfs(root.right,sb);
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        dfs(root,sb);
        return sb.toString();
    }

    private TreeNode build(Queue<String> queue)
    {
        String val = queue.poll();
        if(val.equals("N"))
        {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = build(queue);
        node.right = build(queue);
        return node;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String values[] = data.split(",");
        Queue<String> queue = new LinkedList<>();
        for(int i = 0;i < values.length;i++)
        {
            queue.offer(values[i]);
        }
        return build(queue);      
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));