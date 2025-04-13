public class leetcode_92 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null) return null;
        int size = 0;
        ListNode temp = head;
        while(temp!=null) {
            size++;
            temp = temp.next;
        }
        if(left == 1 && right == size) return reverseList(head);
        int count = 1;
        ListNode l1,l2,l3,temp1,temp2;
        if(left == 1) {
            temp1 = head;
            while(count < (right)) {
                temp1 = temp1.next;
                count++;
            }
            l2 = temp1.next;
            l1 = head;
            temp1.next = null;
            l1 = reverseList(l1);
            temp1 = l1;
            while(temp1.next!=null) {
                temp1=temp1.next;
            }
            temp1.next = l2;
            return l1;
        }
        temp1 = head;
        while(count<(left-1)) {
            temp1 = temp1.next;
            count++;
        }
        l2 = temp1.next;
        temp1.next = null;
        l1 = head;
        temp2 = l2;
        while(count<(right-1)) {
            temp2 = temp2.next;
            count++;
        }
        l3 = temp2.next;
        temp2.next = null;
        l2 = reverseList(l2);
        head = l1;
        while(l1.next != null) {
            l1 = l1.next;
        }
        l1.next = l2;
        temp1 = l2;
        while(temp1.next != null) {
            temp1 = temp1.next;
        }
        temp1.next = l3;
        return head;
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
