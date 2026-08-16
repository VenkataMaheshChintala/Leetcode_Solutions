public class leetcode_430 {
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    };
    public Node helper(Node head) {
        if(head == null) return null;
        Node temp = head;
        while(temp != null && temp.child == null) {
            temp = temp.next;
        }
        if(temp == null) return head;
        Node next = temp.next;
        temp.next = helper(temp.child);
        temp.next.prev = temp;
        temp.child = null;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = next;
        if(next != null){
            next.prev = temp;
        }
        return head;
    }
    public Node flatten(Node head) {
        return helper(head);
    }
}
