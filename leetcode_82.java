public class leetcode_82 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode temp = head;
        ListNode temp1 = temp;
        ListNode prev = temp;
        while(temp.next != null) {
            if(temp.val == temp.next.val) {
                temp1 = temp;
                while(temp1.val == temp.val) {
                    temp1 = temp1.next;
                    if(temp1 == null) {
                        break;
                    }
                }
                if(head == temp) {
                    head = temp1;
                    temp = temp1;
                    prev = temp1;
                } else {
                    temp = temp1;
                    prev.next = temp1;
                }
            } else {
                prev = temp;
                temp = temp.next;
            }
            if(temp == null) {
                break;
            }
        }
        return head;
    }
}
