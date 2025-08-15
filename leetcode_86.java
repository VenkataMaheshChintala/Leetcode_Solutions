public class leetcode_86 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode partition(ListNode head,int x) {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode li1 = l1;
        ListNode li2 = l2;
        while(head!=null) {
            if(head.val < x) {
                l1.next = new ListNode(head.val);
                l1 = l1.next;
            } else {
                l2.next = new ListNode(head.val);
                l2 = l2.next;
            }
            head = head.next;
        }
        l1.next = li2.next;
        return li1.next;
    }
}
