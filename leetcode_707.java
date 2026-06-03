public class leetcode_707 {
    class MyLinkedList {
    Node head;
    Node tail;
    int size;
    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public int get(int index) {
        if(index < 0 || index >= size) {
            return -1;
        }
        int i = 0;
        Node temp = head;
        while(temp!=null && i<index) {
            temp = temp.next;
            i++;
        }
        if(temp == null) return -1;
        else return temp.val;
    }
    
    public void addAtHead(int val) {
        if(head == null) {
            Node node = new Node(val);
            node.next = null;
            head = node;
            tail = node;
        } else {
            Node node = new Node(val);
            node.next = head;
            head = node;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node node = new Node(val);
        node.next = null;
        if(tail == null) {
            tail = node;
            head = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public Node getAddress(int index) {
        Node temp = head;
        int i = 0;
        while(temp != null && i<index) {
            temp = temp.next;
            i++;
        }
        return temp;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) {
            return;
        }
        if(index == 0) {
            addAtHead(val);
            return;
        }
        if(index == size ){
            addAtTail(val);
            return;
        }
        Node indexNode = getAddress(index-1);
        Node node = new Node(val);
        node.next = indexNode.next;
        indexNode.next = node;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) {
            return;
        }
        if(index == 0) {
            head = head.next;
            if(size == 1) {
                tail = null;
            }
            size--;
            return;
        }
        Node prev = getAddress(index - 1);
        if(prev.next == tail) {
            tail = prev;
        }
        prev.next = prev.next.next;
        size--;
    }
}
}
