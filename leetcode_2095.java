public class leetcode_2095 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode getMiddleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = slow;
        while(fast!=null && fast.next!=null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return prev;
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;
        ListNode mid = getMiddleNode(head);
        mid.next = mid.next.next;
        return head;
    }
}
