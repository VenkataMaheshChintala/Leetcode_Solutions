public class leetcode_1721 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fl1 = head;
        ListNode fl2 = head;
        ListNode temp = head;
        int nodes = 1;
        while(temp.next != null) {
            temp = temp.next;
            nodes++;
        }
        for(int i=1;i<k;i++) {
            fl1 = fl1.next;
        }
        int n = nodes - k;
        for(int i=1;i<=n;i++) {
            fl2 = fl2.next;
        }
        n = fl1.val;
        fl1.val = fl2.val;
        fl2.val = n;
        return head;
    }
}
