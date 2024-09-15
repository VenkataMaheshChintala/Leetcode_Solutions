public class leetcode_876 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode middleNode(ListNode head) {
        int nodes = 0;
        ListNode temp = head;
        while(temp!=null) {
            nodes++;
            temp = temp.next;
        }
        nodes = nodes/2;
        temp = head;
        for(int i=0;i<nodes;i++) {
            temp = temp.next;
        }
        return temp;
    }
}
