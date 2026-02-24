import java.util.HashMap;

public class leetcode_138 {
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
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();
        Node temp = head;
        while(temp!=null) {
            map.put(temp,new Node(temp.val));
            temp = temp.next;
        }
        temp = head;
        Node current = null;
        while(temp!=null) {
            current = map.get(temp);
            current.val = temp.val;
            if(temp.next != null) {
                current.next = map.get(temp.next);
            } else {
                current.next = null;
            }
            current.random = map.get(temp.random);
            temp = temp.next;
        }
        return map.get(head);
    }
}

