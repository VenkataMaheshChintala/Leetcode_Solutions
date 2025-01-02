public class leetcode_19 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int pos) {
        ListNode temp = head;
        int nodes = 1;
        while(temp.next != null) {
            temp = temp.next;
            nodes++;
        }
        if(nodes == pos) return head.next;
        int n = nodes - pos;
        temp = head;
        for(nodes=1;nodes<n;nodes++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
