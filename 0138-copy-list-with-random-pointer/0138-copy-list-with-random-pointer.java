/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();

        if(head == null) return null;
        Node original_nodes = head;
        while(original_nodes != null)
        {
            Node copy = new Node(original_nodes.val);
            map.put(original_nodes,copy);
            original_nodes = original_nodes.next;
        }
        original_nodes = head;
        while(original_nodes != null)
        {
            Node copy = map.get(original_nodes);
            copy.next = map.get(original_nodes.next);
            copy.random = map.get(original_nodes.random);
            original_nodes = original_nodes.next;
        }
        return map.get(head);
    }
}