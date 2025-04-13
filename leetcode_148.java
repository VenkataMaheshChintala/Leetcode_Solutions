public class leetcode_148 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode midPrev = middleNode(head);
        ListNode mid = midPrev.next;
        midPrev.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left,right);
    }
    public ListNode merge(ListNode l1,ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode prev = l3;
        while (l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                ListNode temp = new ListNode(l1.val);
                prev.next = temp;
                prev = temp;
                l1 = l1.next;
            } else if (l1.val == l2.val) {
                ListNode temp = new ListNode(l1.val);
                prev.next = temp;
                prev = temp;
                ListNode temp1 = new ListNode(l1.val);
                prev.next = temp1;
                prev = temp1;
                l1 = l1.next;
                l2 = l2.next;
            } else {
                ListNode temp = new ListNode(l2.val);
                prev.next = temp;
                prev = temp;
                l2 = l2.next;
            }
        }
        while (l1 != null) {
            ListNode temp = new ListNode(l1.val);
            prev.next = temp;
            prev = temp;
            l1 = l1.next;
        }
        while (l2 != null) {
            ListNode temp = new ListNode(l2.val);
            prev.next = temp;
            prev = temp;
            l2 = l2.next;
        }
        return l3.next;
    }
    public ListNode middleNode(ListNode head) {
        if(head == null) return null;
        ListNode slow = head, fast = head, prev = null;
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return prev;
    }
}
