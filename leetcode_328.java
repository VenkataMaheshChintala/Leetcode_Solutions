public class leetcode_328 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode evenList = new ListNode(head.next.val);
        ListNode oddList = new ListNode(head.val);
        ListNode temp = head.next.next;
        ListNode temp2 = evenList,temp3 = oddList;
        int i = 3;
        while (temp != null) {
            ListNode temp1 = new ListNode(temp.val);
            if((i%2) == 0) {
                evenList.next = temp1;
                evenList = temp1;
            } else {
                oddList.next = temp1;
                oddList = temp1;
            }
            temp = temp.next;
            i++;
        }
        oddList.next = temp2;
        return temp3;
    }
}
