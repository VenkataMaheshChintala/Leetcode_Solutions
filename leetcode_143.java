public class leetcode_143 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode current = head;
            while(current != null) {
                ListNode nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
            }
            return prev;
        }
        public void reorderList(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            ListNode mid = slow;
            mid = reverseList(mid);
            ListNode temp1=head,temp2=mid,temp3=null,temp4=null;
            while(temp1 != null && temp2 != null) {
                temp4 = temp2.next;
                temp3 = temp1.next;
                temp1.next = temp2;
                temp1.next.next = temp3;
                temp1 = temp3;
                temp2 = temp4;
            }
            if(temp3 != null) temp3.next = null;
            if(temp4 != null) temp4.next = null;
        }
    }
}
