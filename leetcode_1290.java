public class leetcode_1290 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    public int getDecimalValue(ListNode head) {
        if(head == null) return 0;
        int value = 0;
        int nodes = -1;
        ListNode temp = head;
        while(temp != null) {
            nodes++;
            temp = temp.next;
        }
        temp = head;
        while(temp!=null) {
            value += temp.val * ((int) Math.pow(2,(double) nodes));
            nodes--;
            temp = temp.next;
        }
        return value;
    }
}
