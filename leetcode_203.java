public class leetcode_203 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
         ListNode temp = head;
        ListNode prev = temp;
        while(temp.next!=null) {
            if(temp.val == val) {
                if(temp == head) {
                    head = head.next;
                    prev = head;
                    temp = head;
                } else {
                    prev.next = temp.next;
                    temp = temp.next;
                }
            } else {
                prev = temp;
                temp = temp.next;
            }

        }
        if(temp.val == val) {
            prev.next = null;
        }
        if(head.val == val) {
            return null;
        }
        return head;
    }
}
