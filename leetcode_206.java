public class leetcode_206 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode reverseList(ListNode head) {
        ListNode pp = head;
        ListNode qq = null;
        ListNode rr = null;
        while(pp != null) {
            rr = qq;
            qq = pp;
            pp = pp.next;
            qq.next = rr;
        }
        head = qq;
        return head;
    }
}
