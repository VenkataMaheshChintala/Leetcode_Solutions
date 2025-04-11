public class leetcode_61 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(k<=0) return head;
        if(head== null) return null;
        if(head.next == null) return head;
        ListNode temp = head;
        ListNode temp1;
        ListNode start;
        int size = 0;
        while(temp!=null) {
            size++;
            temp = temp.next;
        }
        if(k>size) {
            while(k>=size) {
                k = k%size;
            }
        }
        int x = size - k;
        if((size == k) || k==0) return head;
        temp = head;
        for(int i=1;i<x;i++) {
            temp = temp.next;
        }
        start = temp;
        temp1 = start.next;
        while(temp.next != null) {
            temp = temp.next;
        }
        start.next = null;
        temp.next = head;
        head = temp1;
        return head;
    }
}
